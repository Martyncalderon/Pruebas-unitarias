package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {
//En esta clse realizamos los test para comprobar la seguridad de una contraseña
    //1.-Primer test: Debil, cuando tiene menos de 8 letras
    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("123aa!"));
    }

    //2.-Segundo test: Debil, cuando solo tiene letras
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghjk"));
    }

    //3.-Tercer test: Medio, cuando tiene letras y numeros
    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde12345"));
    }

    //4.-Cuarto test: Fuerte, cuando tiene letras, numero y simbolos
    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));
    }
}
