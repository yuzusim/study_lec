package shop.mtcoding.blog.model.scrap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import shop.mtcoding.blog.dto.scrap.ScrapRequest;
import shop.mtcoding.blog.dto.scrap.ScrapResponse;
import shop.mtcoding.blog.model.resume.Resume;

@RequiredArgsConstructor
@Repository
public class ScrapRepository {

    private final EntityManager em;

    public ScrapResponse.DetailDTO findScrap(int resumeId) {
        String q = """
                SELECT * FROM scrap_tb WHERE resume_id = ?;
                """;
        Query query = em.createNativeQuery(q);
        query.setParameter(1, resumeId);

        Integer id = 0;
        Boolean isScrap = false;

        System.out.println("id : " + id);
        System.out.println("isScrap : " + isScrap);

        ScrapResponse.DetailDTO responseDTO = new ScrapResponse.DetailDTO(
                id, isScrap
        );

        return responseDTO;
    }

    public ScrapResponse.DetailDTO findScrap(int resumeId, int sessionUserId) {
        String q = """
                SELECT id, 
                case when user_id is null then false else true 
                end as isScrap From scrap_tb 
                where resume_id = ? and user_id = ?;
                """;
        Query query = em.createNativeQuery(q);
        System.out.println("123 : " + resumeId);
        System.out.println("456 : " + sessionUserId);
        query.setParameter(1, resumeId);
        query.setParameter(2, sessionUserId);

        Integer id = null;
        Boolean isScrap = null;
        try {
            Object[] row = (Object[]) query.getSingleResult();
            id = (Integer) row[0];
            isScrap = (Boolean) row[1];
        } catch (Exception e) {
            id = 0;
            isScrap = false;
        }

        System.out.println("id : " + id);
        System.out.println("isScrap : " + isScrap);

        ScrapResponse.DetailDTO responseDTO = new ScrapResponse.DetailDTO(
                id, isScrap
        );

        return responseDTO;
    }

    @Transactional
    public Scrap save(ScrapRequest.SaveDTO requestDTO, Integer sessionUserId) {
        String q = """
                insert into scrap_tb(resume_id, user_id, created_at) values(?,?, now())
                """;
        Query query = em.createNativeQuery(q);
        System.out.println("유저네읨 : " + requestDTO.getResumeId());
        query.setParameter(1, requestDTO.getResumeId());
        query.setParameter(2, sessionUserId);
        query.executeUpdate();



        // 가장 최근에 나온 값을 가져오는 쿼리
        String q2 = """
                select * from scrap_tb where id = (select max(id) from scrap_tb)
                """;

        Query query2 = em.createNativeQuery(q2, Scrap.class);

        Scrap scrap = (Scrap) query2.getSingleResult();
        System.out.println("sc" + scrap);


        return scrap;
    }

    @Transactional
    public void deleteById(Integer id) {
        String q = """
                delete from scrap_tb where id = ?
                """;
        Query query = em.createNativeQuery(q);
        query.setParameter(1, id);
        query.executeUpdate();
    }
}
