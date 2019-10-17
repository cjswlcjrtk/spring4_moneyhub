
"use strict";
var app = app || {};
app = (()=>{	
	const WHEN_ERR = '호출하는 JS 파일을 찾지 못했습니다.';	
	let _, js, authjs;
	let run = x =>
		//세션 값 가져오기
		//외부파일 호출,라우어테 있는걸 가져올 수 있다,x는 webapp까지다.
		$.getScript(x + '/resources/js/cmm/router.js', ()=>{		
			$.extend(new Session(x));
			onCreate();
		})
	let init =() => {
		_ = $.ctx();//세션 없을 경우
		js = $.js();
		authjs = js + '/cmm/auth.js';
	}
	
	let onCreate =()=>{
		init();
		$.when(
			$.getScript(authjs)
		)
		.done(()=>{
			auth.onCreate()
		})
		.fail(()=>{
			alert(WHEN_ERR)	
		})//choose when과 같은 기능
	}
	
	
	return {run:run}
})();

//app(=>{})() 만들떄 커스터마이징
//$.getScript ==>내장된거 꺼내씀
//()=>{	$.extend(new Session(x));==>콜백함수==>호출되면 그때 실행