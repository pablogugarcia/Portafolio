import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from '../interfaces/user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-conversation',
  templateUrl: './conversation.component.html',
  styleUrls: ['./conversation.component.css']
})
export class ConversationComponent implements OnInit {

  friendid: any;
  friends: User[];
  friend: User;
  constructor(private activateRoute: ActivatedRoute,
    private userService: UserService) {

    this.friends = this.userService.getFriends();
    this.friendid = this.activateRoute.snapshot.params['uid'];

    this.friend = this.friends.find((record) => {
      return record.uid == this.friendid;

    });
    console.log(this.friend);



  }

  ngOnInit() {
  }

}
