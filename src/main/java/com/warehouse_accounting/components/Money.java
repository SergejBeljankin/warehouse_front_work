package com.warehouse_accounting.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.Arrays;
import java.util.List;

//@Route(value = "purchases", layout = AppView.class)
//@PageTitle("Закупки")
//public class PurchasesSubMenuView extends VerticalLayout {
//
//    private final Div pageContent = new Div();
//
//    public PurchasesSubMenuView() {
//        pageContent.setSizeFull();
//        add(initSubMenu(), pageContent);
//    }
//
//    private Tabs initSubMenu() {
//        List<String> purchasesMenuItems = Arrays.asList("Заказы поставщикам",
//                "Счета поставщиков",
//                "Приемки",
//                "Возвраты поставщикам",
//                "Счета-фактуры полученные",
//                "Управление закупками");
//        Tabs subMenuTabs = new Tabs();
//        for (String item : purchasesMenuItems) {
//            Tab tab = new Tab();
//            tab.addClassName("subMenuItem");
//            tab.add(item);
//            subMenuTabs.add(tab);
//        }
//
//        return subMenuTabs;
//    }
//}
@Route(value = "money", layout = AppView.class)
@PageTitle("Деньги")
public class Money extends VerticalLayout {

    public Money() {
        Div pageContent = new Div();
        pageContent.setSizeFull();
        add(initSubMeny(), pageContent);
    }

    private Tabs initSubMeny() {
        List<String> moneyMenuItems = Arrays.asList("Платежи",
                "Движение денежных средств",
                "Прибыли и убытки",
                "Взаиморасчеты",
                "Корректировки");
        Tabs subMenuTabs = new Tabs();
        for (String item : moneyMenuItems) {
            Tab tab = new Tab();
            tab.addClassName("subMenuItem");
            tab.add(item);
            subMenuTabs.add(tab);
        }
        return subMenuTabs;
    }
}
