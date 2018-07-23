function validateForm(){
	var x= document.forms["myForm"]["fname"].value;
	
	
	if (x == "") {
        alert("Name must be filled out");
        return false;
    }
    if(isNaN(x)){
    /*alert("text is allow");*/
    	/*it's ok*/
    	return true;
    }
    else{
    alert("number is not allow");
    return false;
    }
    
} 
function validateLname(){
	var y= document.forms["myForm"]["lname"].value;
    if (y == "") {
        alert("last Name must be filled out");
        return false;
    }
    if(isNaN(y)){
    /*alert("text is allow");*/
    	/*it's ok*/
    	return true;
    }
    else{
    alert("lnumber is not allow");
    return false;
    }
}
function validateEmail(){
     var email1 = document.forms["myForm"]["email"].value;
     var reg=/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    if (email1 == "") {
        alert("email must be filled out");
        return false;
    }
     if(!reg.test(email1)){
    	 alert(" email in this format abc123@gmail.com");
         return false;
     }
     
}
function validatePWD(){
	var pass= document.forms["myForm"]["pwd"].value;
	if (pass == "") {
        alert("password must be filled out");
        return false;
    }
	
	var passw=  /^[A-Za-z]\w{7,15}$/;  
	 if(!passw.test(pass)){
		 alert('7 characters which contain only characters, numeric digits, underscore and first character must be a letter')  
		 return false;  
	} 
  


}
function validateMob(){
var val = document.forms["myForm"]["mob"].value;
var mob1= /^\d{10}$/;
if (!mob1.test(val)) {
	
alert("Invalid number; must be ten digits")
    
    return false

}
}

function validatePin(){
var pinum=document.forms["myForm"]["pin"].value;
/*var pinum2= ^[1-9][0-9]{6}*$;*/
if(pinum == ""){
alert("enter numeric value");
return false;
}
 if(isNaN(pinum)){
	 alert('enter numeric value');
	 return false;
 }

 

}
