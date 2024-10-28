![title](https://github.com/user-attachments/assets/7828a6dc-0d4a-42a1-a036-5b7f34035fb7)

## 스프링 부트와 AWS 로 혼자 구현하는 웹 서비스 - 이동욱

공부 시작일: 2024-10-28 (월)
공부 목표: 취업, AWS

---

### 목차


01장 인텔리제이로 스프링 부트 시작하기
1.1 인텔리제이 소개
1.2 인텔리제이 설치하기
1.3 인텔리제이 커뮤니티에서 프로젝트 생성하기
1.4 그레이들 프로젝트를 스프링 부트 프로젝트로 변경하기
1.5 인텔리제이에서 깃과 깃허브 사용하기

02장 스프링 부트에서 테스트 코드를 작성하자
2.1 테스트 코드 소개
2.2 Hello Controller 테스트 코드 작성하기
2.3 롬복 소개 및 설치하기
2.4 Hello Controller 코드를 롬복으로 전환하기

03장 스프링 부트에서 JPA로 데이터베이스 다뤄보자
3.1 JPA 소개
 Spring Data JPA
 실무에서 JPA
요구사항 분석
3.2 프로젝트에 Spring Data Jpa 적용하기
3.3 Spring Data JPA 테스트 코드 작성하기
3.4 등록/수정/조회 API 만들기
3.5 JPA Auditing으로 생성시간/수정시간 자동화하기
 LocalDate 사용
 JPA Auditing 테스트 코드 작성하기

04장 머스테치로 화면 구성하기
4.1 서버 템플릿 엔진과 머스테치 소개
 머스테치란
 머스테치 플러그인 설치
4.2 기본 페이지 만들기
4.3 게시글 등록 화면 만들기
4.4 전체 조회 화면 만들기
4.5 게시글 수정, 삭제 화면 만들기
 게시글 수정
 게시글 삭제

05장 스프링 시큐리티와 OAuth 2.0으로 로그인 기능 구현하기
5.1 스프링 시큐리티와 스프링 시큐리티 Oauth2 클라이언트
5.2 구글 서비스 등록
5.3 구글 로그인 연동하기
 스프링 시큐리티 설정
 로그인 테스트
5.4 어노테이션 기반으로 개선하기
5.5 세션 저장소로 데이터베이스 사용하기
5.6 네이버 로그인
 네이버 API 등록
 스프링 시큐리티 설정 등록
5.7 기존 테스트에 시큐리티 적용하기

06장 AWS 서버 환경을 만들어보자 - AWS EC2
6.1 AWS 회원 가입
6.2 EC2 인스턴스 생성하기
6.3 EC2 서버에 접속하기
6.4 아마존 리눅스 1 서버 생성 시 꼭 해야 할 설정들

07장 AWS에 데이터베이스 환경을 만들어보자 - AWS RDS
7.1 RDS 인스턴스 생성하기
7.2 RDS 운영환경에 맞는 파라미터 설정하기
7.3 내 PC에서 RDS에서 접속해 보기
 Database 플러그인 설치
7.4 EC2에서 RDS에서 접근 확인

08장 EC2 서버에 프로젝트를 배포해 보자
8.1 EC2에 프로젝트 Clone 받기
8.2 배포 스크립트 만들기
8.3 외부 Security 파일 등록하기
8.4 스프링 부트 프로젝트로 RDS 접근하기
 RDS 테이블 생성
 프로젝트 설정
 EC2 설정
8.5 EC2에서 소셜 로그인하기

09장 코드가 푸시되면 자동으로 배포해 보자 - Travis CI 배포 자동화
9.1 CI & CD 소개
9.2 Travis CI 연동하기
 Travis CI 웹 서비스 설정
 프로젝트 설정
9.3 Travis CI와 AWS S3 연동하기
 AWS Key 발급
 Travis CI에 키 등록
 S3 버킷 생성
 .travis.yml 추가
9.4 Travis CI와 AWS S3, CodeDeploy 연동하기
 EC2에 IAM 역할 추가하기
 CodeDeploy 에이전트 설치
 CodeDeploy를 위한 권한 생성
 CodeDeploy 생성
 Travis CI, S3, CodeDeploy 연동
9.5 배포 자동화 구성
 deploy.sh 파일 추가
 .travis.yml 파일 수정
 appspec.yml 파일 수정
 실제 배포 과정 체험
9.6 CodeDeploy 로그 확인

10장 24시간 365일 중단 없는 서비스를 만들자
10.1 무중단 배포 소개
10.2 엔진엑스 설치와 스프링 부트 연동하기
10.3 무중단 배포 스크립트 만들기
 profile API 추가
 real1, real2 profile 생성
 엔진엑스 설정 수정
 배포 스크립트들 작성
10.4 무중단 배포 테스트

11장 1인 개발 시 도움이 될 도구와 조언들
11.1 추천 도구 소개
 댓글
 외부 서비스 연동
 방문자 분석
 CDN
 이메일 마케팅
11.2 1인 개발 팁
11.3 마무리
