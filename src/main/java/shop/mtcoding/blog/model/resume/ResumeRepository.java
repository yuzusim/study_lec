package shop.mtcoding.blog.model.resume;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ResumeRepository {

    private final EntityManager em;

    public List<Resume> findAll(){
         String q = """
                    select * from resume_tb order by id desc
                    """;
        Query query = em.createNativeQuery(q, Resume.class);
        List<Resume> resumeList = query.getResultList();

        return resumeList;
    }

    public void findById(){}

    @Transactional
    public void updateById(){}

    @Transactional
    public void save() {}

    @Transactional
    public void deleteById () {}

}
