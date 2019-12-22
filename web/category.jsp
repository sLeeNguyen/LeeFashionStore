<%-- 
    Document   : category.jsp
    Created on : Nov 23, 2019, 10:45:46 PM
    Author     : Lee Nguyen
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@page import="model.Product"%>

<%
    session.setAttribute("view", "/category");
    Category category = (Category) session.getAttribute("selectedCategory");
%>

<div class="content">
    <div class="container">
        <div class="col-m-on">
            <!---->
            <div class="in-line">
                <div class="para-all">
                    <h3>LATEST  ARRIVALS</h3>
                    <p>Check our all latest products in this section.</p>
                </div>
                <div class="lady-on">
                    <%
                        List<Product> categoryProducts = (List<Product>) session.getAttribute("categoryProducts");
                        int count = 1;
                        for (Product p: categoryProducts) {
                    %>
                    <c:if test="<%=(count%3 != 0) %>">
                        <div class="col-md-4 you-all">
                            <a href="product?<%=p.getProductId()%>">
                                <img class="img-responsive pic-in" src="imageshow/<%=p.getImage()%>" alt=" " >
                            </a>
<!--                            <div class=" you-onto">
                                <span>15<label>%</label></span>
                                <small>off</small>
                            </div>-->
                            <div class="showInfo">
                                <p><%=p.getName()%></p>
                                <span><%=p.getPriceFormat()%>  | <label class="cat-in"> </label> 
                                    <a href="addToCart?<%=p.getProductId()%>">Add to Cart </a></span>
                            </div>
                            
                        </div>
                    </c:if>
                    <c:if test="<%=(count%3 == 0)%>">
                        <div class="col-md-4 you-all para-grid">
                            <a href="product?<%=p.getProductId()%>">
                                <img class="img-responsive pic-in" src="imageshow/<%=p.getImage()%>" alt=" " >
                            </a>
<!--                            <div class=" you-onto">
                                <span>15<label>%</label></span>
                                <small>off</small>
                            </div>-->
                            <p><%=p.getName()%></p>
                            <span><%=p.getPriceFormat()%>  | <label class="cat-in"> </label>
                                <a href="addToCart?<%=p.getProductId()%>">Add to Cart </a></span>
                        </div>
                    </c:if>
                    <%count++;%>
                    <% } %>
                    
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <!---->
        <div class="lady-in-on">
            <div class="buy-an">
                <h3>OTHER PRODUCTS</h3>
                <p>Check our all latest products in this section.</p>
            </div>
            <ul id="flexiselDemo1">			
                <li><a href="#"><img class="img-responsive women" src="images/faa.jpg" alt=""></a>
                    <div class="hide-in">
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  |  <a href="#">Buy Now</a></span>
                    </div></li>
                <li><a href="#"><img class="img-responsive women" src="images/faa1.jpg" alt=""></a>
                    <div class="hide-in">
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  |  <a href="#">Buy Now</a></span>
                    </div></li>
                <li><a href="#"><img class="img-responsive women" src="images/faa.jpg" alt=""></a>
                    <div class="hide-in">
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  |  <a href="#">Buy Now </a></span>
                    </div></li>
                <li><a href="#"><img class="img-responsive women" src="images/faa1.jpg" alt=""></a>
                    <div class="hide-in">
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  |  <a href="#">Buy Now</a></span>
                    </div></li>
            </ul>
            <script type="text/javascript">
                $(window).load(function () {
                    $("#flexiselDemo1").flexisel({
                        visibleItems: 4,
                        animationSpeed: 1000,
                        autoPlay: true,
                        autoPlaySpeed: 3000,
                        pauseOnHover: true,
                        enableResponsiveBreakpoints: true,
                        responsiveBreakpoints: {
                            portrait: {
                                changePoint: 480,
                                visibleItems: 1
                            },
                            landscape: {
                                changePoint: 640,
                                visibleItems: 2
                            },
                            tablet: {
                                changePoint: 768,
                                visibleItems: 3
                            }
                        }
                    });

                });
            </script>
            <script type="text/javascript" src="js/jquery.flexisel.js"></script>
        </div>
    </div>
</div>