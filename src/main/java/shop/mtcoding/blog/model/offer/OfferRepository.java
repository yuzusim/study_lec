package shop.mtcoding.blog.model.offer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class OfferRepository {
    private final EntityManager em;

    public OfferRequest.CompOfterDTO findByJobsId(Integer jobsId) {

        String q = """
                select
                     ot.id, ut.my_name, rt.title, jt.title, ot.status
                     from offer_tb ot
                     join resume_tb rt
                     on ot.resume_id = rt.id
                     join user_tb ut
                     on ut.id = rt.user_id
                     join jobs_tb jt
                     on jt.id = ot.jobs_id
                     where ot.jobs_id = ?;
                """;
        Query query = em.createNativeQuery(q);
        query.setParameter(1, jobsId);

        OfferRequest.CompOfterDTO compOfterDTO = (OfferRequest.CompOfterDTO) query.getSingleResult();

        return compOfterDTO;
    }
}
