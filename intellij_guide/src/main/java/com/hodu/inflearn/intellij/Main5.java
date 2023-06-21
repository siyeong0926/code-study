package com.hodu.inflearn.intellij;


//command + F = 단어 찾기
//command + R = 단어 교체하기

//command + shift F = 프로젝트,모듈,디렉토리 내에서 단어 찾기
//command + shift R = 프로젝트,모듈,디렉토리 내에서 단어 교체하기

/*
* 정규 표현식은 command + shift R 상태에서 정규식을 선택하면 됨
*
* -문자열 정규 표현식 작성법-
* -----\/jojoldu\/[A-Za-z]*\/app\.js------
* jojoldu 라는 것을 A-Z,a-z 까지 대문자 소문자를 바꿀 것이고
*    * 별표시는 숫자 제한 없이 전부 나오도록 한다
* app/.js 파일들만
* */

//     \/jojoldu\/([A-Za-z]*)\/app\.js
// 위의 app.js 에 있는 jojoldu 를 inflearn 으로 바꾼다
//     \/inflearn\/$1\/app.js

//정규 표현식 참고 링크 : https://jojoldu.tistory.com/160

public class Main5 {



    <script type="application/javascript" src="/jojoldu/main/app.js"></script>
    <script type="application/javascript" src="/jojoldu/board/app.js"></script>

    <script type="application/javascript" src="/jojoldu/comment/app2.js"></script>
    <script type="application/javascript" src="/jojoldu/member/app2.js"></script>
}
