package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        Invoice invoice = new Invoice("1");
        Product product = new Product("aaa");
        Item item = new Item(new BigDecimal(1), 1, new BigDecimal(1));

        item.setInvoice(invoice);
        product.getItems().add(item);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item);
        invoice.getItems().add(0, item);

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        Assertions.assertNotEquals(0, invoiceId);

        invoiceDao.deleteById(invoiceId);
    }
}
