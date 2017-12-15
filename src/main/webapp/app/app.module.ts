import './vendor.ts';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Ng2Webstorage } from 'ngx-webstorage';

import { AlbanjarApplicationSharedModule, UserRouteAccessService } from './shared';
import { AlbanjarApplicationAppRoutingModule} from './app-routing.module';
import { AlbanjarApplicationHomeModule } from './home/home.module';
import { AlbanjarApplicationAdminModule } from './admin/admin.module';
import { AlbanjarApplicationAccountModule } from './account/account.module';
import { AlbanjarApplicationEntityModule } from './entities/entity.module';
import { customHttpProvider } from './blocks/interceptor/http.provider';
import { PaginationConfig } from './blocks/config/uib-pagination.config';

// jhipster-needle-angular-add-module-import JHipster will add new module here

import {
    JhiMainComponent,
    NavbarComponent,
    FooterComponent,
    ProfileService,
    PageRibbonComponent,
    ActiveMenuDirective,
    ErrorComponent
} from './layouts';

@NgModule({
    imports: [
        BrowserModule,
        AlbanjarApplicationAppRoutingModule,
        Ng2Webstorage.forRoot({ prefix: 'jhi', separator: '-'}),
        AlbanjarApplicationSharedModule,
        AlbanjarApplicationHomeModule,
        AlbanjarApplicationAdminModule,
        AlbanjarApplicationAccountModule,
        AlbanjarApplicationEntityModule,
        // jhipster-needle-angular-add-module JHipster will add new module here
    ],
    declarations: [
        JhiMainComponent,
        NavbarComponent,
        ErrorComponent,
        PageRibbonComponent,
        ActiveMenuDirective,
        FooterComponent
    ],
    providers: [
        ProfileService,
        customHttpProvider(),
        PaginationConfig,
        UserRouteAccessService
    ],
    bootstrap: [ JhiMainComponent ]
})
export class AlbanjarApplicationAppModule {}
