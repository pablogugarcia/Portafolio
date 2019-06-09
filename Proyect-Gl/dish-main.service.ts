imports ...

@Injectable()
export class DishMainService {

  onDishChanged: BehaviorSubject<any>;
  onDishTypeChanged: BehaviorSubject<any>;
  onDishListFilter: BehaviorSubject<any>;
  dishes: DishList[];

  constructor(private _dishService: DishService, private _typeDishService: DishTypeService) {
    this.onDishChanged = new BehaviorSubject([]);
    this.onDishTypeChanged = new BehaviorSubject([]);
    this.onDishListFilter = new BehaviorSubject('');
  }

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<any> | Promise<any> | any {
    return new Promise((resolve, reject) => {

      Promise.all([
        this.getDishesList(),
        this.getDishType()
      ])
        .then(
          ([files]) => {
            resolve();
          },
          reject
        );
    });
  }

  getDishesList(params?: IHttpParams): Promise<DishList[]> {
    return new Promise((resolve, reject) => {
      this._dishService.getDishesList(params)
        .subscribe((dishes: DishList[]) => {
          this.onDishChanged.next(dishes);
          resolve(dishes);
        }, reject);
    }
    );
  }

  getDishType(): Promise<DishType[]> {
    return new Promise((resolve, reject) => {
      this._typeDishService.getDishType()
        .subscribe((response: DishType[]) => {
          this.onDishTypeChanged.next(response);
          resolve(response);

        }, reject);
    });
  }
}
