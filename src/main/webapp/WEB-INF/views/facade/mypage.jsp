<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../common/head.jsp"/>
<div class="container">
<div></div><div><h1>마이페이지</h1></div><div></div>
<div></div>
<div id="inner">
<div>환영합니다</div><div>${facade.ename}님</div>
<div>아이디</div><div>${facade.empno}</div>
<div>비밀번호</div><div>${facade.ename}</div>
<div>부서번호</div><div>${facade.deptno}</div>
<div>부서명</div><div>${facade.dname}</div>
<div>지역</div><div>${facade.loc}</div>
<div>담당</div><div>${facade.job}</div>
<div>매니저</div><div>${facade.mgr}</div>
<div>입사일</div><div>${facade.hiredate}</div>
<div>연봉</div><div>${facade.sal}</div>
<div>보너스</div><div>${facade.comm}</div>

<div><input id="account" type="button" value="Account부서"/></div>
<div><input id="research" type="button" value="Research부서"/></div>
<div><input id="sales" type="button" value="Sales부서"/></div>
<div><input id="operations" type="button" value="Operations부서"/></div>
</div>
<div></div>
<div></div><div></div><div></div>`
</div>
<jsp:include page="../common/foot.jsp"/>