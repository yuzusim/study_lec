package shop.mtcoding.blog.model.offer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Repository;
import shop.mtcoding.blog.model.apply.ApplyResponse;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class OfferRepository {
    private final EntityManager em;

    public List<OfferRequest.CompOfterDTO> findAllByJobsId(Integer jobsId){
        String q = """
                select
                     ot.id, ut.my_name, rt.title, ot.status
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

        JpaResultMapper mapper = new JpaResultMapper();
        List<OfferRequest.CompOfterDTO> result = mapper.list(query,OfferRequest.CompOfterDTO.class);
        return result;
    }
}
