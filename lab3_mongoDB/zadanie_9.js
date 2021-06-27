let pingpong = db.people.updateMany({ first_name: "Antonio" }, { $set: { hobby: "pingpong" } });
printjsononeline(pingpong);