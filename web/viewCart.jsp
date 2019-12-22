<%-- 
    Document   : viewCart
    Created on : Dec 14, 2019, 10:44:19 PM
    Author     : Lee Nguyen
--%>
<c:set var='view' value='/viewCart' scope='session' />
<div class="container">
    <div class="check">	 
        <c:set var="value">
            <c:choose>
                <%-- if 'selectedCategory' session object exists, send
                user to previously viewed category --%>
                <c:when test="${!empty selectedCategory}">
                    category
                </c:when>
                <%-- otherwise send user to welcome page --%>
                <c:otherwise>
                    index.jsp
                </c:otherwise>
            </c:choose>
        </c:set>
                <c:if test="${isLogined != null && !isLogined}">
                    <p style="text-align: center;color: red;">You need to sign in!</p>

                </c:if>
        <c:if test="${!empty cart && cart.getNumberOfItems() != 0}">
            <c:url var="url" value="viewCart">
                <c:param name="clear" value="true"/>
            </c:url>
            <div class="col-md-9 cart-items">
                <h1>My Shopping Bag (${cart.getNumberOfItems()})</h1>
                <a href="${url}" class="clearCart">Clear Your Cart</a>
                <script>
                    $(document).ready(function (c) {
                        $('.close1').on('click', function (c) {
                            $('.cart-header').fadeOut('slow', function (c) {
                                $('.cart-header').remove();
                            });
                        });
                    });
                </script>
            
                <c:forEach var="cartItem" items="${cart.getItems()}" varStatus="iter">
                    <c:set var="product" value="${cartItem.getProduct()}"/>
                    <div class="cart-header">
                        <a class="close1" href="removeItem?productId=${product.productId}"> </a>
                        <div class="cart-sec simpleCart_shelfItem">
                            <a href="product?${product.getProductId()}" class="cart-item cyc">
                                <img src="imageshow/${product.getImage()}" alt="">
                            </a>
                            <div class="cart-item-info">
                                <h3><a href="product?${product.getProductId()}">
                                        ${product.getName()}
                                    </a>
                                    <span>
                                        Price: $ ${product.getPrice()}/unit
                                    </span>
                                </h3>
                                <form action="updateCart" method="post" class="update">
                                    <input type="hidden" name="productId" value="${product.productId}"/>
                                    Quantity: <input type="text" maxlength="2" size="2" 
                                           value="${cartItem.getQuantity()}" 
                                           name="quantity"/>
                                    <input type="submit" name="submit" value="update"/>
                                </form>
                                <div class="delivery">
                                    <p>Service Charges : $1.3</p>
                                    <span>Delivered in 2-3 bussiness days</span>
                                    <div class="clearfix"></div>
                                </div>  
                            </div>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </c:forEach>		
            </div>
        
            <div class="col-md-3 cart-total">
                <c:url var="url" value="${value}"/>
                <a class="continue" href="${url}">Continue Shopping</a>
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
                    <li class="last_price"> <h4>TOTAL</h4></li>	
                    <li class="last_price"><span>${cart.calculateTotal(initParam.deliveryFee)}${cart.getTotalCurrencyFormat()}</span></li>
                </ul>

                <div class="clearfix"></div>
                <a class="order" href="checkout">Checkout</a>
            </div>
        </c:if>
        <c:if test="${(empty cart) || (cart.getNumberOfItems() == 0)}">
            <c:url var="url" value="${value}"/>
            <div class="empty">
                <h1>My Shopping Bag (0)</h1>
                <div class="empty-cart">
                    <span class="mascot-image"></span>
                    <p class="message">Your cart is empty</p>
                    <a href="${value}" class="btn btn-yellow">Continue Shopping</a>
                </div>
            </div>
        </c:if>
    </div>
</div>


