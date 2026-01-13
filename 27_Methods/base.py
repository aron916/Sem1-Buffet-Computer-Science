import json
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.naive_bayes import MultinomialNB
from sklearn.pipeline import Pipeline
import joblib

with open("./Buffet_Poole26/Python/001_Final/intents.json") as file: