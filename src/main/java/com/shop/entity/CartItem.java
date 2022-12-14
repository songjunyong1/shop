package com.shop.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Getter @Setter
@Table(name="cart_item")
public class CartItem {
@Id
@GeneratedValue
@Column(name = "cart_item_id")
private Long id;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="cart_id")
private Cart cart;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "item_id")
private Item item;

private int count; // 같은 상품을 장바구니에 몇 개 담을지 저장한다.
}