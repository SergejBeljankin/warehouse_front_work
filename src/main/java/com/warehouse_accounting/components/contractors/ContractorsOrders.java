package com.warehouse_accounting.components.contractors;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.warehouse_accounting.components.contractors.grids.ContractorsFilterLayout;
import com.warehouse_accounting.components.contractors.grids.ContractorsGridLayout;

@SpringComponent
@UIScope
public class ContractorsOrders extends VerticalLayout{

    private final ContractorsGridLayout contractorsGridLayout;
    private final ContractorsFilterLayout filterLayout;


    public ContractorsOrders(ContractorsGridLayout contractorsGridLayout, ContractorsFilterLayout filterLayout) {
        this.contractorsGridLayout = contractorsGridLayout;
        this.filterLayout = filterLayout;

        add(getGroupButtons(), this.filterLayout, this.contractorsGridLayout);
    }


    private HorizontalLayout getGroupButtons() {
        HorizontalLayout groupControl = new HorizontalLayout();

        Button helpButton = new Button();
        helpButton.setIcon(new Icon(VaadinIcon.QUESTION_CIRCLE));
        helpButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY, ButtonVariant.LUMO_LARGE);
        helpButton.addClickListener(c -> {
            Notification.show("Из Моего Склада можно звонить контрагентам — для этого " +
                    "необходимо подключить один из сервисов телефонии. Записи " +
                    "создаются автоматически при входящем или исходящем звонке. " +
                    "Зарегистрированные звонки фиксируются в этом разделе.", 4000, Notification.Position.TOP_CENTER);
        });

        Label textProducts = new Label();
        textProducts.setText("Звонки");
        textProducts.setTitle("H1");

        Button refreshButton = new Button();
        refreshButton.setIcon(new Icon(VaadinIcon.REFRESH));
        refreshButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        refreshButton.addClickListener(click -> {
            System.out.println("перезагрузка");
        });

        Button addFilterButton = new Button("Фильтр");
        addFilterButton.addClickListener(click -> {
            if(!filterLayout.isVisible()){
                filterLayout.setVisible(true);
            }else {
                filterLayout.setVisible(false);
            }
        });

        TextField searchField = new TextField();
        searchField.setPlaceholder("Номер или комментарий");
        searchField.addThemeVariants(TextFieldVariant.LUMO_SMALL);

        groupControl.add(helpButton, textProducts, refreshButton,
                addFilterButton, searchField);
        setSizeFull();
        return groupControl;
    }

}
