3단계 문제.

큐브의 명령어 F로 예를 들면, F를 할때 돌아가는 면과 위치는 정해져 있다. 해당하는 면과 그 면에 붙어있는 하나의 줄들은 언제나 같이 돌아가다. 따라서 그 성질을 이용해 루빅스 큐브를 구현 하려 한다.
<img width="667" alt="스크린샷 2020-12-12 오후 3 42 05" src="https://user-images.githubusercontent.com/58679737/101977458-e6cbb880-3c90-11eb-94b7-7dcf9dec387b.png">
초록색 면을 돌리려 할때 그 초록색 면에 닿아있는 부분을 초록색으로 처리했다. 이부분은 언제나 초록색 면을 돌릴때 같이 회전하므로 이것을 이용해서 큐브를 구현하려한다.
