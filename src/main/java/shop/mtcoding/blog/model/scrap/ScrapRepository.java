package shop.mtcoding.blog.model.scrap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

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

    public static Scrap save(ScrapRequest.SaveDTO requestDTO, Integer id) {
        return null;
    }
}
