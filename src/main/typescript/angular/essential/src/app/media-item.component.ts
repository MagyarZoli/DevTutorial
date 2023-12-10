import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'mw-media-item',
  templateUrl: './media-item.component.html',
  styleUrls: ['./media-item.component.css']
})
export class MediaItemComponent {
  @Input() mediaItem;
  @Output() delete = new EventEmitter();
  // @Input('mediaItemToWatch') mediaItem;
  name = 'The Redemption';
  wasWatched() {
    return true;
  }
  onDelete() {
    console.log('deleted');
    this.delete.emit();
  }
}
