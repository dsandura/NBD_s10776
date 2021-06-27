let editors = db.people.updateMany({ job: "Editor" }, { $unset: { email: "" } });
printjsononeline(editors)