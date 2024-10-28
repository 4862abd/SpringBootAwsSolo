![title](https://github.com/user-attachments/assets/7828a6dc-0d4a-42a1-a036-5b7f34035fb7)

## 스프링 부트와 AWS 로 혼자 구현하는 웹 서비스 - 이동욱

공부 시작일: 2024-10-28 (월)
공부 목표: 취업, AWS

---

### 목차


01장 인텔리제이로 스프링 부트 시작하기 <br>
1.1 인텔리제이 소개<br>
1.2 인텔리제이 설치하기<br>
1.3 인텔리제이 커뮤니티에서 프로젝트 생성하기<br>
1.4 그레이들 프로젝트를 스프링 부트 프로젝트로 변경하기<br>
1.5 인텔리제이에서 깃과 깃허브 사용하기<br>
<br>
02장 스프링 부트에서 테스트 코드를 작성하자<br>
2.1 테스트 코드 소개<br>
2.2 Hello Controller 테스트 코드 작성하기<br>
2.3 롬복 소개 및 설치하기<br>
2.4 Hello Controller 코드를 롬복으로 전환하기<br>
<br>
03장 스프링 부트에서 JPA로 데이터베이스 다뤄보자<br>
3.1 JPA 소개<br>
 Spring Data JPA<br>
 실무에서 JPA<br>
요구사항 분석<br>
3.2 프로젝트에 Spring Data Jpa 적용하기<br>
3.3 Spring Data JPA 테스트 코드 작성하기<br>
3.4 등록/수정/조회 API 만들기<br>
3.5 JPA Auditing으로 생성시간/수정시간 자동화하기<br>
 LocalDate 사용<br>
 JPA Auditing 테스트 코드 작성하기<br>
<br>
04장 머스테치로 화면 구성하기<br>
4.1 서버 템플릿 엔진과 머스테치 소개<br>
 머스테치란<br>
 머스테치 플러그인 설치<br>
4.2 기본 페이지 만들기<br>
4.3 게시글 등록 화면 만들기<br>
4.4 전체 조회 화면 만들기<br>
4.5 게시글 수정, 삭제 화면 만들기<br>
 게시글 수정<br>
 게시글 삭제<br>
<br>
05장 스프링 시큐리티와 OAuth 2.0으로 로그인 기능 구현하기<br>
5.1 스프링 시큐리티와 스프링 시큐리티 Oauth2 클라이언트<br>
5.2 구글 서비스 등록<br>
5.3 구글 로그인 연동하기<br>
 스프링 시큐리티 설정<br>
 로그인 테스트<br>
5.4 어노테이션 기반으로 개선하기<br>
5.5 세션 저장소로 데이터베이스 사용하기<br>
5.6 네이버 로그인<br>
 네이버 API 등록<br>
 스프링 시큐리티 설정 등록<br>
5.7 기존 테스트에 시큐리티 적용하기<br>
<br>
06장 AWS 서버 환경을 만들어보자 - AWS EC2<br>
6.1 AWS 회원 가입<br>
6.2 EC2 인스턴스 생성하기<br>
6.3 EC2 서버에 접속하기<br>
6.4 아마존 리눅스 1 서버 생성 시 꼭 해야 할 설정들<br>
<br>
07장 AWS에 데이터베이스 환경을 만들어보자 - AWS RDS<br>
7.1 RDS 인스턴스 생성하기<br>
7.2 RDS 운영환경에 맞는 파라미터 설정하기<br>
7.3 내 PC에서 RDS에서 접속해 보기<br>
 Database 플러그인 설치<br>
7.4 EC2에서 RDS에서 접근 확인
<br>
08장 EC2 서버에 프로젝트를 배포해 보자<br>
8.1 EC2에 프로젝트 Clone 받기<br>
8.2 배포 스크립트 만들기<br>
8.3 외부 Security 파일 등록하기<br>
8.4 스프링 부트 프로젝트로 RDS 접근하기<br>
 RDS 테이블 생성<br>
 프로젝트 설정<br>
 EC2 설정<br>
8.5 EC2에서 소셜 로그인하기<br>
<br>
09장 코드가 푸시되면 자동으로 배포해 보자 - Travis CI 배포 자동화<br>
9.1 CI & CD 소개<br>
9.2 Travis CI 연동하기<br>
 Travis CI 웹 서비스 설정<br>
 프로젝트 설정<br>
9.3 Travis CI와 AWS S3 연동하기<br>
 AWS Key 발급<br>
 Travis CI에 키 등록<br>
 S3 버킷 생성<br>
 .travis.yml 추가<br>
9.4 Travis CI와 AWS S3, CodeDeploy 연동하기<br>
 EC2에 IAM 역할 추가하기<br>
 CodeDeploy 에이전트 설치<br>
 CodeDeploy를 위한 권한 생성<br>
 CodeDeploy 생성<br>
 Travis CI, S3, CodeDeploy 연동<br>
9.5 배포 자동화 구성<br>
 deploy.sh 파일 추가<br>
 .travis.yml 파일 수정<br>
 appspec.yml 파일 수정<br>
 실제 배포 과정 체험<br>
9.6 CodeDeploy 로그 확인<br>
<br>
10장 24시간 365일 중단 없는 서비스를 만들자<br>
10.1 무중단 배포 소개<br>
10.2 엔진엑스 설치와 스프링 부트 연동하기<br>
10.3 무중단 배포 스크립트 만들기<br>
 profile API 추가<br>
 real1, real2 profile 생성<br>
 엔진엑스 설정 수정<br>
 배포 스크립트들 작성<br>
10.4 무중단 배포 테스트<br>
<br>
11장 1인 개발 시 도움이 될 도구와 조언들<br>
11.1 추천 도구 소개<br>
 댓글<br>
 외부 서비스 연동<br>
 방문자 분석<br>
 CDN<br>
 이메일 마케팅<br>
11.2 1인 개발 팁<br>
11.3 마무리<br>
