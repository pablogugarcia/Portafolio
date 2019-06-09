imports ...

const routes: Routes = [
  {
    path: 'hacer-pedido', component: MakeOrderMainComponent,
    resolve: {
      data: MakeOrderService
    }
  },
  {
    path: 'confirmar-pedido', component: MakeOrderDoneComponent,
    resolve: {
      data: MakeOrderService
    }
  },
  {
    path: 'mis-pedidos', component: MakeOrderDetailMainComponent,
    resolve: {
      data: MakeOrderDetailService
    }
  },
  {
    path: 'hacer-pedido/gracias', component: MakeOrderThanksComponent,
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class MakeOrderRoutingModule { }
