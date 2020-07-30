db.auth('root', 'root')

db = db.getSiblingDB('dontruckerdb')

db.createUser({
  user: 'dontrucker',
  pwd: 'dontrucker',
  roles: [
    {
      role: 'root',
      db: 'dontruckerdb',
    },
  ],
});