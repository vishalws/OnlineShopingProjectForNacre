




$(document).ready(function(){
	alert("hi");
	$.get("../role",function(json){
		
		var role="<option value=''>select role</option>";
		$.each(json,function(key,value){
			
			role+="<option value='"+value.roleid+"'>"+value.roleName+"</option>";
			
		});
	         $("#role").html(role);
	});
	
}); 





function validateEmail(){
	validatePWD();
     var email1 = document.forms["myForm"]["email"].value;
     var reg=/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    if (email1 == "") {
        alert("email must be filled out");
        return  false;
    }
    
    
     if(!reg.test(email1)){
    	 alert(" email in this format abc123@gmail.com");
         return  false;
     }
     else{
    	 return true;
     }
     
}
function validatePWD(){
	var pass= document.forms["myForm"]["pwd"].value;
	if (pass == "") {
        alert("password must be filled out");
        return  false;
    }
	
	var passw=  /^[A-Za-z]\w{1,6}$/;  
	 if(!passw.test(pass)){
		 alert('1 to 6 characters which contain only characters, numeric digits, underscore and first character must be a letter,head and tail spaces not allowed')  
		 return   false;  
	} 
	 else{
  return  true;
	 }


}