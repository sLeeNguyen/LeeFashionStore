<%-- 
    Document   : product
    Created on : Nov 27, 2019, 11:22:48 PM
    Author     : Lee Nguyen
--%>

<%@page import="model.ProductDetail"%>
<%@page import="model.Product"%>

<%
    session.setAttribute("view", "/product");
    Product selectedProduct = (Product) session.getAttribute("selectedProduct");
    ProductDetail selectedProductDetail = (ProductDetail) session.getAttribute("selectedProductDetail");
%>

<script src="js/jquery.etalage.min.js"></script>
<script>
    jQuery(document).ready(function ($) {

        $('#etalage').etalage({
            thumb_image_width: 300,
            thumb_image_height: 400,
            source_image_width: 900,
            source_image_height: 1200,
            show_hint: true,
            click_callback: function (image_anchor, instance_id) {
                alert('Callback example:\nYou clicked on an image with the anchor: "' + image_anchor + '"\n(in Etalage instance: "' + instance_id + '")');
            }
        });

    });
</script>
<!-- the jScrollPane script -->
<script type="text/javascript" src="js/jquery.jscrollpane.min.js"></script>
<script type="text/javascript" id="sourcecode">
    $(function ()
    {
        $('.scroll-pane').jScrollPane();
    });
</script> 

<div class="content">
    <div class="container">
        <div class="single">
            <div class="col-md-9">
                <div class="single_grid">
                    <div class="grid images_3_of_2">
                        <ul id="etalage">
                            <%
                                for(String img: selectedProductDetail.getAllImages()) {    
                            %>
                            <li>
                                <img class="etalage_thumb_image img-responsive" src="imageshow/<%=img%>" alt="" >
                                <img class="etalage_source_image img-responsive" src="imageshow/<%=img%>" alt="" >
                            </li>
                            <% } %>
                        </ul>
                        <div class="clearfix"> </div>		
                    </div> 
                    <!---->
                    <div class="span1_of_1_des">
                        <div class="desc1">
                            <h3><%=selectedProduct.getName()%> </h3>
                            <p><%=selectedProduct.getDescription()%></p>
                            <h5><%=selectedProduct.getPriceFormat()%> <a href="#">click for offer</a></h5>
                            <div class="available">
                                <h4>Available Options :</h4>
                                <ul>
                                    <li>Size:
                                        <select>
                                            <option>L</option>
                                            <option>XL</option>
                                            <option>S</option>
                                            <option>M</option>
                                        </select>
                                    </li>
                                    <li>Quality:
                                        <select>
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                        </select>
                                    </li>
                                </ul>
                                <div class="form-in">
                                    <a href="addToCart?<%=selectedProduct.getProductId()%>">Add To Cart</a>
                                </div>
                                <span class="span_right"><a href="#">login to save in wishlist </a></span>
                                <div class="clearfix"></div>
                            </div>
                            <div class="share-desc">
                                <div class="share">
                                    <h4>Share Product :</h4>
                                    <ul class="share_nav">
                                        <li><a href="#"><img src="images/facebook.png" title="facebook"></a></li>
                                        <li><a href="#"><img src="images/twitter.png" title="Twiiter"></a></li>
                                        <li><a href="#"><img src="images/rss.png" title="Rss"></a></li>
                                        <li><a href="#"><img src="images/gpluse.png" title="Google+"></a></li>
                                    </ul>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>

                <!----- tabs-box ---->
                <div class="sap_tabs">	
                    <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                        <ul class="resp-tabs-list">
                            <li class="resp-tab-item " aria-controls="tab_item-0" role="tab"><span>Product Description</span></li>
                            <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>Additional Information</span></li>
                            <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>Reviews</span></li>
                        </ul>				  	 
                        <div class="resp-tabs-container">
                            <h2 class="resp-accordion resp-tab-active" role="tab" aria-controls="tab_item-0"><span class="resp-arrow"></span>Product Description</h2><div class="tab-1 resp-tab-content resp-tab-content-active" aria-labelledby="tab_item-0" style="display:block">
                                <div class="facts">
                                    <p ><%=selectedProductDetail.getInformation()%></p>     
                                </div>
                            </div>
                            <h2 class="resp-accordion" role="tab" aria-controls="tab_item-1"><span class="resp-arrow"></span>Additional Information</h2><div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
                                <div class="facts">									
                                    <p > Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections </p>
                                    <ul >
                                        <li>Multimedia Systems</li>
                                        <li>Digital media adapters</li>
                                        <li>Set top boxes for HDTV and IPTV Player applications on various Operating Systems and Hardware Platforms</li>
                                    </ul>
                                </div>	
                            </div>									
                            <h2 class="resp-accordion" role="tab" aria-controls="tab_item-2"><span class="resp-arrow"></span>Reviews</h2><div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
                                <div class="facts">
                                    <p > There are many variations of passages of Lorem Ipsum available, but the majority have 
                                        suffered alteration in some form, by injected humour, or randomised words which don't 
                                        look even slightly believable. If you are going to use a passage of Lorem Ipsum, you 
                                        need to be sure there isn't anything embarrassing hidden in the middle of text. All the
                                        Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, 
                                        making this the first true generator on the Internet. It uses a dictionary of over 200 
                                        Latin words, combined </p>  
                                </div>	
                            </div>
                        </div>
                    </div>
                    <script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
                    <script type="text/javascript">
                        $(document).ready(function () {
                            $('#horizontalTab').easyResponsiveTabs({
                                type: 'default',          
                                width: 'auto', 
                                fit: true 
                            });
                        });
                    </script>	

                </div>
            </div>
            <!---->
            <div class="col-md-3">
                <div class="w_sidebar">
                    <section  class="sky-form">
                        <h4>fashion</h4>
                        <div class="row1 scroll-pane">
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>kurtas</label>
                            </div>
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>fashion sari</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>fashion sari</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>fashion sari</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>fashion sari</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>fashion sari</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>fashion sari</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>fashion sari</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>fashion sari</label>	
                            </div>
                        </div>
                    </section>

                    <section class="sky-form">
                        <h4>colour</h4>
                        <ul class="w_nav2">
                            <li><a class="color1" href="#"></a></li>
                            <li><a class="color4" href="#"></a></li>
                            <li><a class="color5" href="#"></a></li>
                            <li><a class="color6" href="#"></a></li>
                            <li><a class="color7" href="#"></a></li>
                            <li><a class="color8" href="#"></a></li>
                            <li><a class="color9" href="#"></a></li>
                            <li><a class="color10" href="#"></a></li>
                            <li><a class="color12" href="#"></a></li>
                            <li><a class="color13" href="#"></a></li>
                            <li><a class="color14" href="#"></a></li>
                            <li><a class="color15" href="#"></a></li> 
                        </ul>
                    </section>
                    <section class="sky-form">
                        <h4>discount</h4>
                        <div class="row1 scroll-pane">
                            <div class="col col-4" style="opacity: 0.3">
                                <strike>
                                    <label class="radio"><input type="radio" name="radio" ><i></i>60 % and above</label>
                                    <label class="radio"><input type="radio" name="radio"><i></i>50 % and above</label>
                                    <label class="radio"><input type="radio" name="radio"><i></i>40 % and above</label>
                                </strike>
                            </div>
                            <div class="col col-4">
                                <strike style="opacity: 0.3"><label class="radio"><input type="radio" name="radio"><i></i>20 % and above</label></strike>
                                <label class="radio"><input type="radio" name="radio" checked=""><i></i>15 % and above</label>
                                <label class="radio"><input type="radio" name="radio"><i></i>5 % and above</label>
                            </div>
                        </div>						
                    </section>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>