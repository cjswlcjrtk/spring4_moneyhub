<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<body>
회원가입 화면
<h3><a id="back" href="#">뒤로가기</a></h3>
<form id ="join_form" >
<!-- playerId, teamId, playerName, ePlayerName,nickName, joinYYYY , position, backNo, nation, birthDate,solar,height, weight ;             -->
        <div class="input_class1">
    <div>아이디(사원번호):</div><div><input id="join_id" type="text" name="empno" /></div><br/>
    <div>비밀번호(사원이름):</div><div><input id="join_pw" type="password" name="ename" /></div><br/>
    <div>부서번호:</div><div><input type="text"  name="deptno"/></div><br/>
    <div>담당업무:</div><div><input type="text" name="job"/></div><br/>
    <div>매니저:</div><div><input  type="text" name="mgr" /></div><br/>
    <div>고용일:</div><div><input type="text" name="hiredate" /></div><br/>
    <div>연봉:</div><div><input type="text"  name="sal"/></div><br/>
    <div>커미션:</div><div><input type="text" name="comm"/></div><br/>
        <input type="hidden"  name="action" value="join"/>
        <input type="hidden"  name="page" value=login/>
        <input id="member_btn" type="button"  value="가입완료" />
        </div>
</form>
<script>
app.init('${ctx}');
</script>