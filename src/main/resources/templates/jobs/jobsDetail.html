<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Blog</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://kit.fontawesome.com/32aa2b8683.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" />
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
    <link rel="stylesheet" href="/css/style.css">
    <style>
        .my-border {
            border: 1px solid rgb(0, 0, 0);
            padding: 40px;
            padding-top: 0;
            margin-top: 0;
        }

        .selected {
            background-color: #c5f1c5;
        }

        /* .login-model{
                    height: 25em;
                } */
    </style>
</head>

<body>
    <div>
        <div class="header">
            <div class="progress-container">
                <div class="progress-bar progress-bar-striped progress-bar-animated"></div>
            </div>
        </div>

        <div class="mx-auto width-53">
            <div class="container">
                <div class="row">
                    <div class="col-9 my-border my-5">
                        <header>
                            <div class="view-up d-flex py-0 my-0">
                                <div class="  my-auto me-3">
                                    <img src="${jDto.photo}" alt="" srcset=""
                                        style="height: 5em; width: 250px; padding: 5px;">
                                </div>
                                <div class="fs-5 mx-4 my-auto" style="justify-content: center;">
                                    ${jDto.compName}
                                </div>
                                <div class=" fs-4  my-auto">
                                    ${jDto.title}
                                </div>
                            </div>
                        </header>
                        <div class="">
                            <!-- 상세 공고 위치 -->
                            <div class="my-4">
                                <div class="row mb-3">
                                    <!-- 회사정보 -->
                                    <div class="col-2">
                                        <div class="">
                                            <div class="me-5">
                                                경력
                                            </div>
                                            <div class="me-5">
                                                학력
                                            </div>

                                        </div>
                                    </div>
                                    <div class="col-4">
                                        <div class="">
                                            <div>
                                                ${jDto.career}
                                            </div>
                                            <div>
                                                ${jDto.education}
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-2">
                                        <div>근무지역</div>
                                        <div>포지션</div>
                                    </div>
                                    <div class="col-4">
                                        <div>
                                            <div>
                                                ${jDto.address}
                                            </div>
                                        </div>
                                        <div>
                                            <div>
                                                ${jDto.position}
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="d-flex pb-3" style="border-bottom: 1px solid black;">
                                    <div>필요기술 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <c:forEach items="${jDto.skillList}" var="skill">
                                            <span class="badge skill-color me-2">${skill}</span>
                                        </c:forEach>
                                    </div>
                                </div>

                                <div class="relative">
                                    ${jDto.content}
                                    <img class="w-100"
                                        src="https://www.saraminimage.co.kr/recruit/bbs_recruit7/35_bm_img_230217.png">
                                </div>
                                <div class=" mt-5 mb-2">
                                    마감일 / 접수방법
                                </div>

                                <div class="border row ">
                                    <!-- 남은 날짜 -->
                                    <div class="col-4 p-3">
                                        <div class="fs-5 mb-2">남은 기간 : ${jDto.leftTime}일</div>
                                        <div>마감일 : ${jDto.formatEndDate}</div>
                                    </div>
                                    <div class="col-8" style="background-color: rgb(235, 235, 235);">
                                        <c:choose>
                                            <c:when test="${jDto.receipt == '홈페이지 접수'}">
                                                <div class="p-3">
                                                    ${jDto.receipt}
                                                    <a href="${jDto.homepage}">${jDto.homepage}</a>
                                                </div>
                                            </c:when>

                                            <c:otherwise>
                                                <div class="p-3">
                                                    ${jDto.receipt}
                                                </div>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-3">
                        <div class="rButton d-grid view-right p-4">
                            <!-- 뷰포트 -->
                            <div class="d-flex justify-content-between">
                                <div>
                                    ${jDto.compName}
                                </div>
                                <c:choose>
                                    <c:when test="${principal == null && compSession == null}">
                                        <div>
                                            <a href="/user/login">
                                                <i id="scrap-${jDto.jobsId}" class="fa-regular fa-star"></i>
                                            </a>
                                        </div>
                                    </c:when>

                                    <c:otherwise>
                                        <c:choose>
                                            <c:when test="${principal != null && compSession == null}">
                                                <div id="scrap-${jDto.jobsId}-render">
                                                    <div id="scrap-${jDto.jobsId}-remove">
                                                        <c:choose>
                                                            <c:when test="${jDto.userScrapId > 0}">
                                                                <i id="scrap-${jDto.jobsId}"
                                                                    class="fa-solid on-Clicked fa-star my-cursor"
                                                                    onclick="scrap(`${jDto.jobsId}`,`${principal.userId}`,`${jDto.userScrapId}`)"></i>
                                                            </c:when>

                                                            <c:otherwise>
                                                                <i id="scrap-${jDto.jobsId}"
                                                                    class="fa-regular fa-star my-cursor"
                                                                    onclick="scrap(`${jDto.jobsId}`,`${principal.userId}`,`${jDto.userScrapId}`)"></i>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </div>
                                                </div>
                                            </c:when>

                                            <c:otherwise>

                                            </c:otherwise>
                                        </c:choose>
                                    </c:otherwise>
                                </c:choose>
                            </div>
                            <div class="my-1 fs-5">
                                ${jDto.title}
                            </div>
                            <div class="align-self-end" id="apply-render">
                                <div id="apply-btn">
                                    <c:choose>
                                        <c:when test="${principal == null && compSession == null}">
                                            <button type="button" class="btn btn-success w-100" data-bs-toggle="modal"
                                                data-bs-target="#loginModal">지원하기</button>
                                        </c:when>

                                        <c:otherwise>
                                            <c:choose>
                                                <c:when test="${principal != null && compSession == null}">
                                                    <c:choose>
                                                        <c:when test="${jDto.state != null}">
                                                            <c:if test="${jDto.state == 0}">
                                                                <button type="button"
                                                                    class="btn btn-secondary w-100">지원완료</button>
                                                            </c:if>
                                                            <c:if test="${jDto.state == 1}">
                                                                <button type="button"
                                                                    class="btn btn-primary w-100">합격</button>
                                                            </c:if>
                                                            <c:if test="${jDto.state == -1}">
                                                                <button type="button"
                                                                    class="btn btn-danger w-100">불합격</button>
                                                            </c:if>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <button type="button" class="btn btn-success w-100"
                                                                data-bs-toggle="modal" data-bs-target="#myModal"
                                                                onclick="requestResume()">지원하기</button>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </c:when>

                                                <c:otherwise>
                                                    <c:if
                                                        test="${compSession != null && compSession.compId == jDto.compId }">
                                                        <button type="button" class="btn btn-danger w-100"
                                                            onclick="location.href='/jobs/${jDto.jobsId}/update'">수정하기</button>
                                                    </c:if>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:otherwise>
                                    </c:choose>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal" id="myModal">
            <div class="modal-dialog">
                <!-- modal-sm modal-lg modal-xl 모달 사이즈 -->
                <!-- modal-dialog-centered 화면 가운데 -->
                <!-- modal-dialog-scrollable 스크롤 기능 -->
                <div class="modal-content">

                    <div class="modal-header">
                        <h4 class="modal-title">이력서 선택</h4>
                        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                    </div>
                    <div class="modal-body">
                        <div id="render-resume">

                        </div>
                        <button type="button" class="btn btn-success mt-2" style="float: right;"
                            onclick="apply(`${jDto.jobsId}`,`${principal.userId}`)" data-bs-dismiss="modal">지원
                            하기</button>
                    </div>
                </div>
            </div>
        </div>


        <div class="modal" id="loginModal">
            <div class="modal-dialog modal-dialog-centered">
                <!-- modal-sm modal-lg modal-xl 모달 사이즈 -->
                <!-- modal-dialog-centered 화면 가운데 -->
                <!-- modal-dialog-scrollable 스크롤 기능 -->
                <div class="modal-content">

                    <div class="modal-body login-model">
                        <div>
                            <div class="container all-form border-3 mx-auto my-auto">
                                <div class="card-header d-flex justify-content-between my-4">
                                    <div>

                                    </div>
                                    <div class="fs-4">
                                        로그인
                                    </div>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                </div>

                                <form>
                                    <div class="d-flex form-group mb-2">
                                        <input type="email" name="email" class="form-control" placeholder="Enter email"
                                            id="email" value="${cookie.rememberEmail.value}">
                                    </div>

                                    <div class="form-group mb-2">
                                        <input type="password" name="password" class="form-control"
                                            placeholder="Enter password" id="password">
                                    </div>

                                    <div class="box mb-2">
                                        <span class="input-wrap mb-2">
                                            <input type="checkbox" id="rememberEmail" name="rememberEmail">
                                            이메일을 기억 하시겠습니까?
                                        </span>
                                    </div>

                                    <!-- <div class="d-flex justify-content">
                                                    <div>
                                                        <a href="/" class="emailSearch" id="emailSearch">이메일 찾기</a>
                                                    </div>
                                                    <div>
                                                        <a href="/" class="pwSearch" id="pwSearch">비밀번호 찾기</a>
                                                    </div>
                                                </div> -->

                                    <div class="d-grid gap-2 mb-2">
                                        <button class="btn btn-primary" type="button"
                                            onclick="submitLogin(`${jDto.jobsId}`)">로그인
                                        </button>
                                        <div> <a href="/user/join">회원가입</a> </div>
                                    </div>

                                    <hr>
                                    <div class="d-flex justify-content-around ">
                                        <div>
                                            <a href="/" class="emailSearch" id="emailSearch">이용 약관</a>
                                        </div>
                                        <div>
                                            <a href="/" class="pwSearch" id="pwSearch">개인정보 처리방법</a>
                                        </div>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



    <script>
        let resumeId1;
        let jobsId;
        let userId;
        let userScrapId;

        function scrap(jobs, user, userScrap) {
            jobsId = jobs;
            userId = user;

            // 스크랩 id 있을때
            if (userScrap > 0) {
                userScrapId = userScrap;
                $.ajax({
                    type: "delete",
                    url: "/user/scrap/" + userScrapId + "/delete",
                    dataType: "json"
                }).done((res) => {
                    userScrapId = res.data;
                    changeScrap();
                    opener.parent.location.reload();
                }).fail((err) => {
                    alert(err.responseJSON.msg);
                });

            } else {
                let data = {
                    userId: user,
                    jobsId: jobs
                }
                $.ajax({
                    type: "post",
                    url: "/user/scrap/insert",
                    data: JSON.stringify(data),
                    headers: {
                        "content-type": "application/json; charset=utf-8"
                    },
                    dataType: "json"
                }).done((res) => {
                    userScrapId = res.data;
                    opener.parent.location.reload();
                    changeScrap();
                }).fail((err) => {
                    alert(err.responseJSON.msg);
                });
            }
        }

        function changeScrap() {
            $('#scrap-' + jobsId + '-remove').remove();
            renderScrap();
        }

        function renderScrap() {
            let el;

            if (userScrapId > 0) {
                el = `
                    <div id="scrap-`+ jobsId + `-remove">
                        <i id="scrap-`+ jobsId + `" class="fa-solid on-Clicked fa-star my-cursor"
                                                onclick="scrap(`+ jobsId + `,` + userId + `,` + userScrapId + `)"></i>
                                            </div>
                    `;
            } if (userScrapId === 0) {
                el = `
                    <div id="scrap-`+ jobsId + `-remove">
                        <i id="scrap-`+ jobsId + `" class="fa-regular fa-star my-cursor"
                                                onclick="scrap(`+ jobsId + `,` + userId + `,` + userScrapId + `)"></i>
                                            </div>
                    `;
            }
            $('#scrap-' + jobsId + '-render').append(el);
        }

        window.onscroll = function () {
            progressBar()
        };

        function submitLogin(jId) {
            console.log('eef');
            let data = {
                email: $('#email').val(),
                password: $('#password').val(),
                rememberEmail: $('#rememberEmail').val()
            }

            $.ajax({
                type: "post",
                url: "/user/login2",
                data: JSON.stringify(data),
                headers: {
                    "content-type": "application/json; charset=utf-8"
                },
                dataType: "json"
            }).done((res) => {
                location.reload();
            }).fail((err) => {
                alert(err.responseJSON.msg);
            });
        }

        function progressBar() {
            var winScroll = document.body.scrollTop || document.documentElement.scrollTop;
            var height = document.documentElement.scrollHeight - document.documentElement.clientHeight;
            var scrolled = (winScroll / height) * 100;
            document.getElementsByClassName("progress-bar")[0].style.width = scrolled + "%";
        }

        let rDtos;
        function requestResume() {
            $.ajax({
                type: "get",
                url: "/user/request/resume",
                dataType: "json"
            }).done((res) => {
                renderRes(res.data);
            }).fail((err) => {
                alert(err.responseJSON.msg);
            });
        }
        function renderRes(rDtoss) {
            // $('#apply-btn').remove();
            // renderBtn();
            rDtoss.forEach((rd) => {
                renderResumeOne(rd);
            });
            let resumes = document.querySelectorAll('.resumeList');
            resumes.forEach(function (resume) {
                resume.addEventListener('click', function (evt) {
                    // 모든 탭 버튼에서 active 클래스를 제거
                    resumes = document.getElementsByClassName("resumeList");
                    for (i = 0; i < resumes.length; i++) {
                        resumes[i].classList.remove("selected");
                    }
                    evt.currentTarget.classList.add("selected");
                })
            });
        }
        // function renderBtn() {
        //     let el = `
        //             <div id="apply-btn">
        //                             <button type="button" class="btn btn-success w-100" data-bs-toggle="modal"
        //                             data-bs-target="#myModal">지원하기</button>
        //                         </div>
        //             `;
        //     $('#apply-render').append(el);
        // }
        function renderBtnSuccess() {
            let el = `
                    <div id="apply-btn">
                                    <button type="button" class="btn btn-secondary w-100">지원완료</button>
                                </div>
                    `;
            $('#apply-render').append(el);
        }
        function renderResumeOne(rDto) {
            let el = `
                                <div class="card mb-4 resumeList" onclick="selectResume(`+ rDto.resumeId + `)">
                                        <div class="card-body">
                                            <h5 class="card-title" style="text-align: left;">`+ rDto.title + `</h5>
                                            <div class="m-2" style="float: left;">
                                                <h6 class="card-subtitle mb-2 text-muted">`+ rDto.education + `</h6>
                                            </div>
                                            <div class="m-2" style="float: left;">
                                                <h6 class="card-subtitle mb-2 text-muted">`+ rDto.career + `</h6>
                                            </div>
                                                      
                                        </div>
                                    </div>
                `;
            $('#render-resume').append(el);
        }

        function selectResume(id) {
            resumeId1 = id;
        }
        function apply(job, user) {
            let date = {
                jobsId: job,
                resumeId: resumeId1,
                userId: user
            }
            $.ajax({
                type: "post",
                url: "/user/apply/resume",
                data: JSON.stringify(date),
                headers: {
                    "content-type": "application/json; charset=utf-8"
                },
                dataType: "json"
            }).done((res) => {
                alert(res.msg);
                $('#apply-btn').remove();
                renderBtnSuccess();
            }).fail((err) => {
                alert(err.responseJSON.msg);
            });
        }
    </script>
</body>

</html>