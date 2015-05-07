# slackpay
Run a server to easily add venmo payment links to slack slash commands.

## Getting Started
Clone the repo
```
git clone git@github.com:ghmeier/slackpay.git
```
Run it locally
```
./run.sh
```

Does it work? Sweet.
No? Create an issue, or fork it and fix it :)

## Connect with Slack
Go to http://api.slack.com/web and get a token for the team you'd like to activate.
While you're there find the team domain name: `<team_domain>.slack.com`

Add those to slackpay-server/config.yml like this:
```
slack_tokens:
  <team_domain> : <team_token>
```

####Add a slash command
Now add a slash command with slack's integration like so:
![Pictures are easier here](https://raw.githubusercontent.com/ghmeier/slackpay/master/slackpay.png)

Push the server to your favorite hosting service (I like heroku) and run it.

## Using the slash command
`/slackpay @slackbot $1.00 You da best!`
The link will send a payment to slackbot's email on the slack team.
* Username is the slack username
* Payment amount must be formatted $00.00 The two decimal places are required, but you can have as many leading zeroes as you want
* The note is any string after the username and dollar amount.

###I'm running a version and can add your team to it, as well, just ask :)
