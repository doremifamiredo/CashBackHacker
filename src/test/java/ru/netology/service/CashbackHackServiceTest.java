package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void amountIsLessThanThousand() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @org.junit.Test
    public void amountIsThousand() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void amountIsTwoThousand() {
        Assert.assertEquals(service.remain(2000), 0);
    }

    @org.junit.Test
    public void amountIsMoreThanThousand() {
        Assert.assertEquals(service.remain(1001), 999);
    }
}