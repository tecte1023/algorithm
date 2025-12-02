# 🧩 Algorithm

개인적인 알고리즘 문제 풀이 및 학습 기록 저장소입니다.  
주로 **Baekjoon Online Judge (BOJ)** 문제를 **Java**로 풀이하여 업로드합니다.

<br>

## 🚀 Code Review & Study Group
이 저장소는 개인 문제 풀이용 아카이브입니다.  
코드 리뷰는 아래 **PS-ATTACK**에서 진행하고 있습니다.

👉 **[PS-ATTACK 바로가기](https://github.com/PS-ATTACK/PS-ATTACK)**

<br>

## 🛠 Tech Stack
<img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"/>

<br>

## 📂 Directory Structure
백준 문제 번호를 기준으로 **1,000 단위(상위) > 100 단위(하위)** 패키지로 구분하여 관리합니다.  
폴더 정렬을 위해 **5자리 숫자(Zero Padding)** 형식을 사용합니다.

```text
src
 └─ baekjoon
     ├─ p01000             # 1000 ~ 1999 번대
     │   ├─ p01000         # 1000 ~ 1099 번
     │   │   └─ BOJ_1000_AplusB.java
     │   ├─ p01100         # 1100 ~ 1199 번
     │   └─ ...
     ├─ p02000             # 2000 ~ 2999 번대
     │   └─ p02500
     │       └─ BOJ_2557_HelloWorld.java
     └─ ...
