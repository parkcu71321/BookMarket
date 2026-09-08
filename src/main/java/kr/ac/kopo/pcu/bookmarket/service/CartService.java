package kr.ac.kopo.pcu.bookmarket.service;

import kr.ac.kopo.pcu.bookmarket.domain.Cart;

public interface CartService {
    Cart create(Cart cart);
    Cart read(String cartId);
}
