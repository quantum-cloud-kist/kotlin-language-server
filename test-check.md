# Kotlin Language Server 작동 확인 방법

## 1. VSCode/Cursor 재시작
- 명령 팔레트 (Ctrl+Shift+P) → "Developer: Reload Window"

## 2. test-language-server.kt 파일 열기

## 3. 다음 기능들 확인:

### ✅ 문법 하이라이팅
- 키워드(fun, val, class)가 색상으로 표시되는지 확인

### ✅ 자동완성 (Intellisense)
- main() 함수 안에서 "person." 입력
- introduce, name, age 등이 자동완성 리스트에 나타나는지 확인

### ✅ 타입 정보 (Hover)
- "greet" 함수 위에 마우스 올리기
- "fun greet(name: String): String" 정보가 표시되는지 확인

### ✅ 오류 진단
- 파일 끝에 잘못된 코드 추가: "val x: Int = "string""
- 빨간 밑줄과 오류 메시지가 나타나는지 확인

### ✅ 정의로 이동 (Go to Definition)
- "greet" 호출 부분에서 Ctrl+클릭 또는 F12
- 함수 정의로 이동하는지 확인

### ✅ 참조 찾기 (Find References)
- "Person" 클래스 이름에서 우클릭 → "Find All References"
- 모든 사용 위치가 표시되는지 확인

## 4. 언어 서버 로그 확인
- 명령 팔레트 → "Kotlin: Show Language Server Output"
- "Kotlin Language Server: Version 1.3.14" 메시지 확인

## 5. 상태 확인
- VSCode 하단 상태바에 "Kotlin" 또는 언어 서버 상태 확인
