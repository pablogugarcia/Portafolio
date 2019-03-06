import { OnInit, ElementRef, Directive, Input, Renderer2 } from '@angular/core';

@Directive({    selector: '[appResaltar]'})
export class ResaltarDirective implements OnInit {
    constructor(private elRef: ElementRef, private renderer: Renderer2) { }
    @Input('appResaltar') plan = '';
    ngOnInit() {
        if (this.plan === 'pagado') {
            this.renderer.setStyle(this.elRef.nativeElement, 'background-color', 'yellow');
            this.renderer.setStyle(this.elRef.nativeElement, 'font-weigth', 'bold');

        }
    }

}

