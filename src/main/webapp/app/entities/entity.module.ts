import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { AlbanjarApplicationAlbanjarCustomerAlbanjarModule } from './albanjar-customer-albanjar/albanjar-customer-albanjar.module';
import { AlbanjarApplicationAlbanjarProductAlbanjarModule } from './albanjar-product-albanjar/albanjar-product-albanjar.module';
import { AlbanjarApplicationAlbanjarDeliveryAlbanjarModule } from './albanjar-delivery-albanjar/albanjar-delivery-albanjar.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        AlbanjarApplicationAlbanjarCustomerAlbanjarModule,
        AlbanjarApplicationAlbanjarProductAlbanjarModule,
        AlbanjarApplicationAlbanjarDeliveryAlbanjarModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AlbanjarApplicationEntityModule {}
