package shop.mtcoding.blog.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import shop.mtcoding.blog.model.jobs.Jobs;
import shop.mtcoding.blog.model.jobs.JobsRepository;

import java.util.ArrayList;
import java.util.List;

@Import(JobsRepository.class)
@DataJpaTest
public class PagingTest {
    @Autowired
    private JobsRepository jobsRepository;
    final int SHOW_PAGES = 5;
    int currentPage;


    @Test
    public void showPages() {
        currentPage = 1;
        List<Jobs> pageList = jobsRepository.findAll();
        ArrayList<Jobs> jobsList = new ArrayList<>();
        int totalPosts = pageList.size();
        int start = (SHOW_PAGES * currentPage) - SHOW_PAGES;
        int end = SHOW_PAGES * currentPage;

        for (int j = start; j < end; j++) {
            if (j >= totalPosts) {
                break;
            }
            System.out.println(pageList.get(j));
            jobsList.add(pageList.get(j));
        }
    }
}

