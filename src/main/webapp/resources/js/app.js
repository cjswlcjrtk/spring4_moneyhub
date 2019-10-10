var app = (()=>{
	return {
		init : (ctx)=>{
			HrService.login(ctx);
			HrService.join(ctx);
			HrService.moveJoin(ctx);
		
		}
	};
})();

var hr = (()=>{
	var empno, _ename, _deptno, _dname,	_loc, _job,
	_mgr, _hiredate, _sal, _comm;
	var setEmpno = (empno)=>{this.empno = empno;}
	var setEname = (ename)=>{this.ename = ename;}
	var getEmpno = ()=>{return this._empno;}
	var getEname = ()=>{return this._ename;}
	return {
		setEmpno : setEmpno,
		setEname : setEname,
		getEmpno : getEmpno,
		getEname : getEname
	};
})();

var HrService = (()=>{
	return {
		login: (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#username').val()==='' ||
						$('#ename').val()==='' ||
						$('#dname').val()===''){
					alert('필수값이 없습니다.')
				}else{
					alert('입력한 아이디 값: '+$('#username').val());
					$('#login_form').attr('action', ctx+'/hr.do');
					$('#login_form').attr('method','POST');
					$('#login_form').submit();
				}
			});
		},
		join: (ctx)=>{
			$('#member_btn').click(()=>{
				if($('#join_id').val()==='' ||
						$('#join_pw').val()===''){
					alert('필수값이 없습니다.')
				}else{
					alert('입력한 아이디 값: '+$('#join_empno').val());
					$('#join_form').attr('action', ctx+'/hr.do');
					$('#join_form').attr('method','POST');
					$('#join_form').submit();
				}
			});
		},
		moveJoin: (ctx)=>{
			$('#join_btn').click(()=>{
				alert('회원가입 이동');
				location.assign(ctx+'/hr.do?action=move&page=join');
			});
			$('#back').click(()=>{
				location.assign(ctx+'/facade.do?action=move&page=login');
			});
		}
	};
})();

