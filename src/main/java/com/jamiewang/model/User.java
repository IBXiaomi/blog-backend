package com.jamiewang.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;

/**
 * user
 *
 * @author jamiewang
 * @date 16/3/2021
 */
@Data
@Entity
@Table(name = "user_blog")
@ToString(callSuper = true)
//@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * User name.
     */
    @Column(name = "username", length = 20, nullable = false)
    private String username;

    /**
     * age
     */
    @Column(name = "age",nullable = false)
    private int age;

    /**
     * sex
     */
    @Column(name = "sex", length = 30)
    private String sex;

    /**
     * Password.
     */
    @Column(name = "password", length = 32, nullable = false)
    private String password;

    /**
     * User email.
     */
    @Column(name = "email", length = 127)
    private String email;

    /**
     * telephone
     */
    @Column(name = "tel", length = 11)
    private String telNumber;

    /**
     * address
     */
    @Column(name = "addr", length = 50)
    private String address;

    /**
     * id card number
     */
    @Column(name = "card", length = 18)
    private String card;


    @Override
    public void prePersist() {
        super.prePersist();

        if (email == null) {
            email = "";
        }

        if (telNumber == null) {
            telNumber = "";
        }

        if (address == null) {
            address = "";
        }

        if (card == null) {
            card = "";
        }


        if (sex == null) {
            sex = "";
        }
    }
}
