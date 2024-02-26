package shop.mtcoding.blog.com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
public class ComRepository {
    private final EntityManager em;

    @Transactional
    public void join(ComRequest.JoinDTO requestDTO) {
        String q = """
                insert into 
                com_tb (com_name,password, email, biz_num,representative_name,photo, homepage, created_at)
                values 
                (?,?,?,?,?,?,?,now())
                """;
        Query query = em.createNativeQuery(q);
        query.setParameter(1, requestDTO.getComName());
        query.setParameter(2, requestDTO.getPassword());
        query.setParameter(3, requestDTO.getEmail());
        query.setParameter(4, requestDTO.getBizNum());
        query.setParameter(5, requestDTO.getRepresentativeName());
        query.setParameter(6, requestDTO.getPhoto());
        query.setParameter(7, requestDTO.getHomepage());

        query.executeUpdate();
    }
}
