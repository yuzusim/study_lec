package shop.mtcoding.blog.model.jobs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import shop.mtcoding.blog.model.user.User;

@RequiredArgsConstructor
@Repository
public class JobsRepository {
    private final EntityManager em;

    public void findAll(){
        Query query = em.createNativeQuery("select * from user_tb where role = 2 order by id desc ",User.class);
        query.getResultList();
    }

    public void findById(){}

    @Transactional
    public void updateById(){}

    @Transactional
    public void save() {}

    @Transactional
    public void deleteById () {}
}
