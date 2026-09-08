package kr.ac.kopo.pcu.bookmarket.repository;

import kr.ac.kopo.pcu.bookmarket.domain.Cart;

public interface CartRepository {
    Cart create(Cart cart);
    Cart read(String cartId);
}