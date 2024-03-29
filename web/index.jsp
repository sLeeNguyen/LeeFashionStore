<%-- 
    Document   : index
    Created on : Nov 19, 2019, 9:24:31 PM
    Author     : Lee Nguyen
--%>

<c:set var='view' value='/index' scope='session' />

<div class="content">
    <div class="container">
        <div class="women-in">
            <div class="col-md-9 col-d">
                <div class="banner">
                    <video class="banner-video" loop autoplay>
                        <source src="images/bannervideo.mp4" type="video/mp4"/>
                    </video>
                    <div class="sub-banner-logo">
                        <a href="index.jsp"><img src="images/logo.png" alt=" "></a>
                    </div>
                </div>
                <!---->
                <div class="in-line">
                    <div class="para-an">
                        <h3>LATEST  ARRIVALS</h3>
                        <p>Check our all latest products in this section.</p>
                    </div>
                    <div class="lady-in">
                        <c:forEach var="product" items="${newProducts}">
                            <div class="col-md-4 you-para">
                                <a href="<c:url value='product?${product.productId}'/>">
                                       <img class="img-responsive pic-in" style="height: 200px;"
                                            src="${initParam.imgProductPath}${product.getImage()}" alt=" ">
                                </a>
<!--                                <div class="you-in">
                                    <span>15<label>%</label></span>
                                    <small>off</small>
                                </div>  -->
                                <p>${product.getName()}</p>
                                <!--<span>$${product.getPrice()}  | <label class="cat-in"> </label> <a href="#">Add to Cart </a></span>-->
                            </div>
                        </c:forEach>
                        
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-m-left">
                <div class="in-left">				
                    <p class="code">Cool COLLECTIONS</p>		
                    <div class="cool">		
                    </div>		
                </div>
                <div class="discount">
                    <a href="#"><img class="img-responsive pic-in" src="images/p2.jpg" alt=" " >	</a>		
                    <p class="no-more">Exclusive <b>discount</b> <span>Womens wear</span></p>					
                    <a href="#" class="know-more">know more</a>
                </div>
                <div class="discount">
                    <a href="#"><img class="img-responsive pic-in" src="images/p3.jpg" alt=" " ></a>			
                    <p class="no-more no-get">Get Exclusive <b>discount on</b> <span>Ladies wear</span></p>					
                    <a href="#" class="know-more">know more</a>
                </div>
                <div class="discount">
                    <a href="single.html"><img class="img-responsive pic-in" src="images/p2.jpg" alt=" " >	</a>		
                    <p class="no-more">Exclusive <b>discount</b> <span>Womens wear</span></p>					
                    <a href="#" class="know-more">know more</a>
                </div>
                <div class="twitter-in">
                    <h5>TWITTER  UPDATES</h5>
                    <span class="twitter-ic">	</span>
                    <div class="up-date">
                        <p>@leenguyen Looks like nice and dicent design</p>
                        <a href="#">http://bit.ly/sun</a>
                        <p class="ago">About 1 hour ago via twitterfeed</p>
                    </div>
                    <div class="up-date">
                        <p>@leenguyen Looks like nice and dicent design</p>
                        <a href="#">http://bit.ly/sun</a>
                        <p class="ago">About 1 hour ago via twitterfeed</p>
                    </div>
                    <a href="#" class="tweets">More Tweets</a>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <!---->
        <div class="lady-in-on">
            <div class="buy-an">
                <h3>CATEGORY</h3>
                <p>Check our all latest products in this section.</p>
            </div>
            <ul id="flexiselDemo1">
                <c:forEach var="category" items="${categories}">
                    <li><a href="<c:url value='category?${category.categoryId}'/>">
                            <img class="img-responsive women" src="${initParam.imgCategoryPath}${category.getImage()}" alt="">
                        </a>
                    <div class="hide-in">
                        <p>${category.getName()}</p>
                        <!--<span><a href="category?${category.categoryId}">View</a></span>-->
                    </div></li>
                </c:forEach>
                
            </ul>
            <script type="text/javascript">
                $(window).load(function() {
                    $("#flexiselDemo1").flexisel({
                        visibleItems: 4,
                        animationSpeed: 1500,
                        autoPlay: true,
                        autoPlaySpeed: 2000,
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
<!---->