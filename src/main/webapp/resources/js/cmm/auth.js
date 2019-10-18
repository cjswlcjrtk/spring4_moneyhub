"use strict";
var auth = auth || {};
auth = (()=>{
	const WHEN_ERR = '호출하는 JS 파일을 찾지 못했습니다.';	
	let _, js, vue;
	
	let init = () => {
		_ = $.ctx();
		js = $.js();
		vue = js + '/vue/auth_vue.js';	//스트링값, 객체가 아니다	
	}	
	
	let onCreate = () => {
		init();
		$.when(
			$.getScript(vue)				
		)
		.done(()=>{	
			$('#a_go_join').click(()=>{
				alert('회원가입 클릭!!')			
				$('head')
					.html(auth_vue.join_head())				
				$('#form_join')
					.html(auth_vue.join_body())
							$('<button>',{							
								text : '회원 가입',
								click : e =>{
									alert('Ghost 클릭3!!')	
									e.preventDefault();//form 태그 무력화 저때 디폴트는 폼태그
									let data = {cid : $('#clientid').val() , pwd : $('#password').val()}
									alert('전송아이디' + data.cid)
									$.ajax({
										url : _ + '/client/join',
										type : 'POST',
										dataType : 'json',
										data : JSON.stringify(data),//받는 녀석 기준으로 데이터 타입을 맞춰준다.
										contentType : 'application/json',
										success : d => {
											alert('Ajax 아이디 : ' + d.cid + '비번 : ' + d.pwd);
										},
										error : e => {
											alert('Ajax 실패');
										}
									})
								}							
							})
							.addClass('btn btn-primary btn-lg btn-bloc')
							.appendTo('#btn_join')
					$('<a>',{
						text: '추가된  A 태그2',
						href: '#',
						click : ()=>{
							alert('Ghost 클릭2!!')
						}
					})
					.appendTo('#test')				
			});
		})
		.fail(()=>{
			alert(WHEN_ERR)
		})
	} 	
	return{onCreate:onCreate}
	
})();