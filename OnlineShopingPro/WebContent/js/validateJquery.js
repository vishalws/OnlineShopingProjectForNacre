
 /*$(document).ready(function () {
	  //called when key is pressed in textbox
	  $("#pin1").keypress(function (e) {
	     //if the letter is not digit then display error and don't type anything
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	        //display error message
	        $("#errmsg1").html("Digits Only").show().fadeOut("slow");
	               return true;
	    }
	   });
	});
  
  $(document).ready(function () {
	  
	 var ph=$("phone1").val();
	 if (ph.match(/^[789]{1}$/)) {
		 alert("hi");
	 }
	  //called when key is pressed in textbox
	  $("#phone1").keypress(function (e) {
		  
	     //if the letter is not digit then display error and don't type anything
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	        //display error message
	        $("#errmsg").html("Digits Only").show().fadeOut("slow");
	               return true;
	    }
	   });
	}); 



*/





$(document).ready(function () {
	    $("#account_info").validate({  
	        rules: {
	            fname: {
	                required: true
	                 },
	            lname: {
	                required: true
	            },
	            datepicker:{
	                required: true
	            },
	            gen:{
	            	required:true
	            },
	            pwd:{
	            	required:true,
	            	minlength:6,
	                maxlength:12
	            },
	            
	            mob:{
	            	required:true,
	            	minlength:10,
	            	maxlength:10
	            },
	            
	            email:{
	            	required:true,
	            	email:true
	            },
	            
	           /* city:{
	            	required:true
	            },
	            state:{
	            	required:true
	            },*/
	            pin:{
	            	required:true
	            }
	        },
	        messages: {
	            fname: {
	                required: "enter friest number"
	                	
	            },
	           lname: {
	                required: "Enter last name"
	               
	            },
	           
	            gen:{
	            	required:"enter gender"
	            },
	            pwd:{
	            	required:"enter password",
	            	minlength:"atleast 6 digit",
	                maxlength:"max 12 digit"
	            },
	            
	            mob:{
	            	required:"enter mobile number",
	            	minlength:"number should be 10 digit",
	            	maxlength:" the number should be 10 digit"
	            },
	            
	            email:{
	            	required:"enter email id"
	            },
	            
	           /* city:{
	            	required:"enter the city"
	            },
	            state:{
	            	required:"enter the state"
	            },*/
	            pin:{
	            	required:"enter pin code"
	            }

	        },
	     
	    });
	    

	});