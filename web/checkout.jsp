<%-- 
    Document   : checkout
    Created on : Dec 16, 2019, 10:38:29 AM
    Author     : Lee Nguyen
--%>
<c:set var='view' value='/checkout' scope='session' />
<div class="container">
    <div class="row">
        <div class="col-md-9 col-sm-9">
            <div class="x_panel">
                <div class="x_title">
                    <h2>Checkout</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <p><strong>In order to purchase the items in your shopping cart, please provide us with the following information:</strong></p>
                    <c:if test="${!empty orderFailureFlag}">
                        <p style="color: #c00; font-style: italic">We were unable to process your order. Please try again!</p>
                    </c:if>
                    <form class="form-check form-horizontal form-label-left" novalidate action="<c:url value='purchase' />" method="post">
                        <span class="section"></span>
                        <div class="item form-group">
                            <label class="col-form-label col-md-3 col-sm-3 label-align" for="name">Name <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6">
                                <input id="name" class="form-control" data-validate-length-range="6" data-validate-words="2" name="name" placeholder="both name(s) e.g Jon Doe" required="required" type="text">
                            </div>
                        </div>
                        <div class="item form-group">
                            <label class="col-form-label col-md-3 col-sm-3 label-align" for="email">Email <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6">
                                <input type="email" id="email" name="email" required="required" class="form-control">
                            </div>
                        </div>
                        <div class="item form-group">
                            <label class="col-form-label col-md-3 col-sm-3 label-align" for="telephone">Telephone <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6">
                                <input type="tel" id="telephone" name="phone" required="required" data-validate-length-range="8,20" class="form-control">
                            </div>
                        </div>
                        <div class="item form-group">
                            <label class="col-form-label col-md-3 col-sm-3 label-align" for="address">Address <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6">
                              <input type="text" name="address" class="optional form-control">
                            </div>
                        </div>
                        <div class="item form-group">
                            <label class="col-form-label col-md-3 col-sm-3 label-align" for="city">City <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6">
                              <input type="text" name="city" class="optional form-control">
                            </div>
                        </div>
                        <div class="item form-group">
                            <label class="col-form-label col-md-3 col-sm-3 label-align" for="number">Credit Card Number<span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6">
                              <input type="number" id="number" name="number" required="required" class="form-control">
                            </div>
                        </div>
                        <div class="ln_solid"></div>
                        <div class="form-group btn-checkout">
                            <div class="col-md-6 offset-md-3">
                                <button type="submit" class="btn btn-primary">Cancel</button>
                                <button id="send" type="submit" class="btn btn-success">Submit</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <div class="col-md-3 cart-total-check">
            <c:url var="url" value="${value}"/>
            <div class="order-info">
                <h4>ORDER INFORMATION</h4>
            </div>
            <div class="clearfix"></div>
            <div class="price-details">
                <h3>Price Details</h3>
                <span>Total</span>
                <span class="total1">${cart.getSubtotalCurrencyFormat()}</span>
                <span>Discount</span>
                <span class="total1">---</span>
                <span>Delivery Charges</span>
                <span class="total1">$${initParam.deliveryFee}</span>
                <div class="clearfix"></div>				 
            </div>	
            <ul class="total_price">
                <li class="last_price"> <h4>CREDIT TOTAL</h4></li>	
                <li class="last_price"><span>${cart.calculateTotal(initParam.deliveryFee)}${cart.getTotalCurrencyFormat()}</span></li>
            </ul>

            <div class="clearfix"></div>
            <a class="order" href="#">Place Order</a>
            <div class="total-item">
                <h3>OPTIONS</h3>
                <h4>COUPONS</h4>
                <a class="cpns" href="#">Apply Coupons</a>
                <p><a href="#">Log In</a> to use accounts - linked coupons</p>
            </div>
        </div>
    </div>
</div>
