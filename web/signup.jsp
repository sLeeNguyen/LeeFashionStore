<%-- 
    Document   : signup
    Created on : Dec 11, 2019, 10:11:31 AM
    Author     : Lee Nguyen
--%>
<%
    String exists = (String) session.getAttribute("exists");
%>
<div class="content">
    <div class="container"> 			         
        <div class="register">
            <% if (exists != null && !exists.isEmpty()) {%>
                <p style="color: red;">Username already exists!</p>
            <% } %>    
            <form name="form-name" action="Log?action=SignUp" method="post" onsubmit="return validate()">
                <div class="register-top-grid sign-up">
                    <h2>PERSONAL INFORMATION</h2>
                    <div class="mation">
                        <span>Full Name <label id="errFname"></label></span>
                        <input type="text" name="fullname"> 

                        <span>Email <label id="errEmail"></label></span>
                        <input type="text" name="email">
                        
                        <span>Address <label></label></span>
                        <input type="text" name="address">
                        
                        <span>Username <label id="errUsername"></label></span>
                        <input type="text" name="username"> 

                        <span>Password <label id="errPass"></label></span>
                        <input type="password" name="password"> 

                        <span>Confirm Password <label id="errCon-Pass" ></label></span>
                        <input type="password" name="confirm-pass">       
                        
                        <div class="submit"><input type="submit" value="Sign Up" name="sign-up"/></div>

                    </div>
                    <div class="clearfix"> </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript" src="js/validate.js"></script>
