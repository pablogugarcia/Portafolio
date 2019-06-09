imports ... 

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  encapsulation: ViewEncapsulation.None,
  animations: fuseAnimations
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;

  constructor(
    private _fuseConfigService: FuseConfigService,
    private _formBuilder: FormBuilder,
    private _authLogin: AuthUserService,
    private _router: Router,
    private _navigationService: NavigationService
  ) {
    // Configure the layout
    this._fuseConfigService.config = {
      layout: {
        navbar: {
          hidden: true
        },
        toolbar: {
          hidden: true
        },
        footer: {
          hidden: true
        },
        sidepanel: {
          hidden: true
        }
      }
    };
  }

  ngOnInit(): void {
    this.loginForm = this._formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required]
    });
  }

  onSubmit(): void {
    const email = this.loginForm.get('email').value;
    const password = this.loginForm.get('password').value;

    this._authLogin.login({ email, password }).subscribe(x => {
      localStorage.setItem('key', x.key);
      sessionStorage.setItem('key', x.key);
      this.getUser();
    }, (error) => {

    });

  }

  getUser(): void {
    this._authLogin.getUser().subscribe(x => {
      localStorage.setItem('user', JSON.stringify(x));
      this._navigationService.setCurrentNavigation();
      this._router.navigate(['/hacer-pedido']);
    }, (error) => {

    });
  }

}
