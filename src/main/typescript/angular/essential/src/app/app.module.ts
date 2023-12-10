import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
// import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HttpXhrBackend } from '@angular/common/http';
import { MockXHRBackend } from './mock-xhr-backend';

import { AppComponent } from './app.component';
import { MediaItemComponent } from './media-item.component';
import { MediaItemListComponent } from './media-item-list.component';
import { MediaItemFormComponent } from './media-item-form.component';

import { FavoriteDirective } from './favorite.directive';

import { CategoryListPipe } from './category-list.pipe';

// import { MediaItemService } from './media-item.service';

import { lookupLists, lookupListToken } from './providers';

// const lookupLists = {
//   mediums: ['Movies', 'Series']
// };

// @NgModule({
//   imports: [
//     BrowserModule,
//     // FormsModule,
//     ReactiveFormsModule
//   ],
//   declarations: [
//     AppComponent,
//     MediaItemComponent,
//     MediaItemListComponent,
//     FavoriteDirective,
//     CategoryListPipe,
//     MediaItemFormComponent
//   ],
//   bootstrap: [
//     AppComponent
//   ]
// })
// export class AppModule {}

@NgModule({
  imports: [
    BrowserModule,
    // FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  declarations: [
    AppComponent,
    MediaItemComponent,
    MediaItemListComponent,
    FavoriteDirective,
    CategoryListPipe,
    MediaItemFormComponent
  ],
  // providers: [
  //   MediaItemService
  // ]
  providers: [
    // { provide: 'lookupListToken', useValue: lookupLists }
    { provide: lookupListToken, useValue: lookupLists },
    { provide: HttpXhrBackend, useValue: MockXHRBackend }
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule {}
