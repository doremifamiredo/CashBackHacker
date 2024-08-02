package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void amountIsLessThanThousand() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
    public void amountIsThousand() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void amountIsMoreThanThousand() {
        Assert.assertEquals(service.remain(1001), 999);
    }
}