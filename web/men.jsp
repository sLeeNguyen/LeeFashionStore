<%-- 
    Document   : men.jsp
    Created on : Nov 20, 2019, 9:25:26 PM
    Author     : Lee Nguyen
--%>

<div class="content">
    <div class="container">
        <div class="  col-m-on">
            <!---->
            <div class="in-line">
                <div class="para-all">
                    <h3>LATEST  ARRIVALS</h3>
                    <p>Check our all latest products in this section.</p>
                </div>
                <div class="lady-on">
                    <div class="col-md-4 you-men">
                        <a href="single.html"><img class="img-responsive pic-in" src="images/men.jpg" alt=" " ></a>
                        <div class=" you-onto">
                            <span>15<label>%</label></span>
                            <small>off</small>
                        </div>
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  | <label class="cat-in"> </label> <a href="#">Add to Cart </a></span>
                    </div>
                    <div class="col-md-4 you-men">
                        <a href="single.html"><img class="img-responsive pic-in" src="images/men1.jpg" alt=" " ></a>
                        <div class=" you-onto">
                            <span>15<label>%</label></span>
                            <small>off</small>
                        </div>
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  | <label class="cat-in"> </label> <a href="#">Add to Cart </a></span>
                    </div>
                    <div class="col-md-4 you-men para-grid">
                        <a href="single.html"><img class="img-responsive pic-in" src="images/men2.jpg" alt=" " ></a>
                        <div class=" you-onto">
                            <span>15<label>%</label></span>
                            <small>off</small>
                        </div>
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  | <label class="cat-in"> </label> <a href="#">Add to Cart </a></span>
                    </div>						
                    <div class="col-md-4 you-men">
                        <a href="single.html"><img class="img-responsive pic-in" src="images/men2.jpg" alt=" " ></a>
                        <div class="you-in you-onto">
                            <span>15<label>%</label></span>
                            <small>off</small>
                        </div>
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  | <label class="cat-in"> </label> <a href="#">Add to Cart </a></span>
                    </div>
                    <div class="col-md-4 you-men">
                        <a href="single.html"><img class="img-responsive pic-in" src="images/men.jpg" alt=" " ></a>
                        <div class="you-in you-onto">
                            <span>15<label>%</label></span>
                            <small>off</small>
                        </div>
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  | <label class="cat-in"> </label> <a href="#">Add to Cart </a></span>
                    </div>
                    <div class="col-md-4 you-men para-grid">
                        <a href="single.html"><img class="img-responsive pic-in" src="images/men1.jpg" alt=" " ></a>
                        <div class=" you-onto">
                            <span>15<label>%</label></span>
                            <small>off</small>
                        </div>
                        <p>Premium Denim Women's Hidden</p>
                        <span>$179.00  | <label class="cat-in"> </label> <a href="#">Add to Cart </a></span>
                    </div>
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
                    </div></a></li>
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