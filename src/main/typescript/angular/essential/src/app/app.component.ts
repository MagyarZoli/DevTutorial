import { Component } from '@angular/core';

// @Component({
//   selector: 'mw-app',
//   template: `
//     <h1>My App</h1>
//     <p>Keeping track of the media I want to watch.</p>
//   `
// })
// export class AppComponent {}

// @Component({
//   selector: 'mw-app',
//   templateUrl: './app.component.html',
//   styles: [`
//     h1 { color: #ffffff; }
//     .description {
//       font-style: italic;
//       color: green;
//     }
//   `]
// })
// export class AppComponent {}

@Component({
  selector: 'mw-app',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  firstMediaItem = {
    id: 1,
    name: 'Firebug',
    medium: 'Series',
    category: 'Science Fiction',
    year: 2010,
    watchedOn: 1294166565384,
    isFavorite: false
  };
  onMediaItemDelete(mediaItem) {}
}
