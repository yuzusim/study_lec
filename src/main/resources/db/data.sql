-- 개인
insert into user_tb(my_name, password, email, phone, address, birth, photo, role, created_at) values('최주호', '1234', 'ssar@nate.com', '010-7777-7777', '부산', '1999-01-20', 'ssar_img.png', 1, now());
insert into user_tb(my_name, password, email, phone, address, birth, photo, role, created_at) values('하승진', '1234', 'cos@nate.com', '010-2222-7733', '광주', '1987-05-10', 'cos_img.png', 1, now());
insert into user_tb(my_name, password, email, phone, address, birth, photo, role, created_at) values('김성훈', '1234', 'love@nate.com', '010-3333-1256', '부산', '2000-11-10', 'love_img.png', 1, now());

-- 기업 //my_name 란에는 대표자명 작성
insert into user_tb (my_name, password, email, phone, address, birth, business_number, photo, comp_name, homepage, role, created_at) values('이재용', '1234', 'samsung@nate.com', '051-332-5555', '부산', '1950-09-09', '302-12-88441', 'samsung_img.png', '(주)삼성', 'samsung.co.kr', 2, now());
insert into user_tb (my_name, password, email, phone, address, birth, business_number, photo, comp_name, homepage, role, created_at) values('김스티븐', '1234', 'apple@nate.com', '02-2241-7434', '서울', '2001-12-09', '607-88-11020', 'apple_img.png', '애플전자', 'apple.co.kr', 2, now());
insert into user_tb (my_name, password, email, phone, address, birth, business_number, photo, comp_name, homepage, role, created_at) values('김태형', '1234', 'wowbrother@nate.com', '02-3315-4321', '서울', '2010-05-25', '302-66-88542', 'wowbrother_img.png', '배민', 'wowbrother.co.kr', 2, now());


-- 이력서 테이블
insert into resume_tb(user_id, title, area, edu, career, introduce, port_link, is_public, created_at) values (1, '능력있고 성실한 개발자!', '판교분당', '학력무관', '미들(4~8년)', '열심히 일하는 개발자가 되겠습니다.', 'naver.com/superjjangcoding', true, now());
insert into resume_tb(user_id, title, area, edu, career, introduce, port_link, is_public, created_at) values (2, '신입 개발자 지원합니다', '서울', '대학(2~3)', '신입', '안녕하십니까. 엄격한 아버지와 자상한 어머니의 밑에서 자라나 20대가 된 저는', 'nate.com/gugu', true, now());
insert into resume_tb(user_id, title, area, edu, career, introduce, port_link, is_public, created_at) values (3, '이력서 입니다.', '부산', '학력무관', '시니어(10년 이상)', '팀장으로 근무했었고 코딩은 자신있습니다.', 'naver.com/codingsin', true, now());

-- 공고 테이블
INSERT INTO jobs_tb(user_id, area, edu, career, content, dead_line, task, created_at) VALUES (4, '부산', '학력무관', '미들(4~8년)', '성실하고 열심히 일하실 분 모집!', '2024-03-10', '백엔드', NOW());
INSERT INTO jobs_tb(user_id, area, edu, career, content, dead_line, task, created_at) VALUES (4, '서울', '4년제', '신입', '성실하고 열심히 일하실 분 모집!', '2024-05-22', '백엔드', NOW());
INSERT INTO jobs_tb(user_id, area, edu, career, content, dead_line, task, created_at) VALUES (4, '울산', '학력무관', '시니어(10년 이상)', '성실하고 열심히 일하실 분 모집!', '2024-04-09', '백엔드', NOW());
INSERT INTO jobs_tb(user_id, area, edu, career, content, dead_line, task, created_at) VALUES (5, '부산', '학력무관', '신입', '성실하고 열심히 일하실 분 모집!', '2024-03-29', '백엔드', NOW());


-- 스킬 테이블 (개인)
insert into skill_tb (resume_id, name, role) values(1, 'java', 1);
insert into skill_tb (resume_id, name, role) values(1, 'javaScript', 1);
insert into skill_tb (resume_id, name, role) values(1, 'HTML/CSS', 1);
insert into skill_tb (resume_id, name, role) values(1, 'Webpack', 1);
insert into skill_tb (resume_id, name, role) values(2, 'jQuery', 1);
insert into skill_tb (resume_id, name, role) values(2, 'Oracle', 1);
insert into skill_tb (resume_id, name, role) values(3, 'React', 1);
insert into skill_tb (resume_id, name, role) values(3, 'Java', 1);


-- 스킬 테이블 (기업)
INSERT INTO skill_tb(jobs_id, name, role) VALUES(1, 'java', 2);
INSERT INTO skill_tb(jobs_id, name, role) VALUES(1, 'jQuery', 2);
INSERT INTO skill_tb(jobs_id, name, role) VALUES(1, 'React', 2);
INSERT INTO skill_tb(jobs_id, name, role) VALUES(2, 'HTML/CSS', 2);
INSERT INTO skill_tb(jobs_id, name, role) VALUES(3, 'javaScript', 2);
INSERT INTO skill_tb(jobs_id, name, role) VALUES(3, 'java', 2);